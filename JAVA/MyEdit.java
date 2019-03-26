import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class JavaEdit extends Frame implements ActionListener {

    String clipBoard;
    String fileName;
    TextArea text;
    MenuItem newMI, openMI, saveMI, saveAsMI, exitMI;
    MenuItem selectAllMI, cutMI, copyMI, deleteMI, pasteMI;
    MenuItem aboutJavaEditMI;

    /**
     * Constructor
     */
    public JavaEdit() {
        super("JavaEdit");          // set frame title
        setLayout(new BorderLayout());  // set layout

    // create menu bar
        MenuBar menubar = new MenuBar();
        setMenuBar(menubar);

    // create file menu
        Menu fileMenu = new Menu("File");
        menubar.add(fileMenu);
        newMI = fileMenu.add(new MenuItem("New"));
        newMI.addActionListener(this);
        openMI = fileMenu.add(new MenuItem("Open"));
        openMI.addActionListener(this);
        fileMenu.addSeparator();
        saveMI = fileMenu.add(new MenuItem("Save"));
        saveAsMI = fileMenu.add(new MenuItem("Save As ..."));
        fileMenu.addSeparator();
        exitMI = fileMenu.add(new MenuItem("Exit"));
        exitMI.addActionListener(this);

    // create edit menu
        Menu editMenu = new Menu("Edit");
        menubar.add(editMenu);
        selectAllMI = editMenu.add(new MenuItem("Select all"));
        selectAllMI.addActionListener(this);

        cutMI = editMenu.add(new MenuItem("Cut"));
        cutMI.addActionListener(this);

        copyMI = editMenu.add(new MenuItem("Copy"));
        copyMI.addActionListener(this);

        pasteMI = editMenu.add(new MenuItem("Paste"));
        pasteMI.addActionListener(this);

        deleteMI = editMenu.add(new MenuItem("Delete"));
        deleteMI.addActionListener(this);

    // create help menu
        Menu helpMenu = new Menu("Help");
        menubar.add(helpMenu);
        aboutJavaEditMI = helpMenu.add(new MenuItem("About JavaEdit"));
        aboutJavaEditMI.addActionListener(this);

        // create text editing area
        text = new TextArea();
        add(text, BorderLayout.CENTER);
    }

    // implementing ActionListener
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if(source == newMI) {
            clearText();
            fileName = null;
            setTitle("JavaEdit");   // reset frame title
        }
        else if(source == openMI) {
            doOpen();
        }
    else if(source == saveMI) {
            doSave();
    }
    else if(source == saveAsMI){
    doSaveAs();
    }
        else if(source == exitMI) {
            System.exit(0);
        }
        else if(source == cutMI) {
            doCopy();
            doDelete();
        }
        else if(source == copyMI) {
            doCopy();
        }
        else if(source == pasteMI) {
            doPaste();
        }
        else if(source == deleteMI) {
            doDelete();
        }
    }

    /**
     * method to specify and open a file
     */
    private void doOpen() {
        // display file selection dialog
        FileDialog fDialog = new FileDialog(this, "Open ...", FileDialog.LOAD);
        fDialog.setVisible(true);
        // Get the file name chosen by the user
        String name = fDialog.getFile();

    // If user canceled file selection, return without doing anything.
        if(name == null)
            return;
        fileName = fDialog.getDirectory() + name;

    // Try to create a file reader from the chosen file.
        FileReader reader=null;
        try {
            reader = new FileReader(fileName);
        } catch (FileNotFoundException ex) {
            MessageDialog dialog = new MessageDialog(this, "Error Message",
                                                     "File Not Found: "+fileName);
                dialog.setVisible(true);
                return;
        }

        BufferedReader bReader = new BufferedReader(reader);

    // Try to read from the file one line at a time.
        StringBuffer textBuffer = new StringBuffer();
        try {
            String textLine = bReader.readLine();
            while (textLine != null) {
                textBuffer.append(textLine + '\n');
                textLine = bReader.readLine();
        }
            bReader.close();
            reader.close();
        } catch (IOException ioe) {
            MessageDialog dialog = new MessageDialog(this, "Error Message",
                                       "Error reading file: "+ioe.toString());
            dialog.setVisible(true);
            return;
        }
        setTitle("JavaEdit: " +name);   // reset frame title
        text.setText(textBuffer.toString());
    }   

    /**
     * method to clear text editing area
     */
    private void clearText() {
        text.setText("");
    }

    /**
     * method to copy selected text to the clipBoard
     */
    private void doCopy() {
        clipBoard = new String(text.getSelectedText());
    }

    /**
     * method to delete selected text
     */
    private void doDelete() {
        text.replaceRange("", text.getSelectionStart(), text.getSelectionEnd());
    }

    /**
     * method to replace current selection with the contents of the clipBoard
     */
    private void doPaste() {
        if(clipBoard != null) {
            text.replaceRange(clipBoard, text.getSelectionStart(),
                              text.getSelectionEnd());
        }
    }

    /**
     * class for message dialog
     */
    class MessageDialog extends Dialog implements ActionListener {
        private Label message;
        private Button okButton;

     // Constructor
        public MessageDialog(Frame parent, String title, String messageString) {
            super(parent, title, true);
            setSize(400, 100);
            setLocation(150, 150);
            setLayout(new BorderLayout());

            message = new Label(messageString, Label.CENTER);
            add(message, BorderLayout.CENTER);

            Panel panel = new Panel(new FlowLayout(FlowLayout.CENTER));
            add(panel, BorderLayout.SOUTH);
            okButton = new Button(" OK ");
            okButton.addActionListener(this);
            panel.add(okButton);
        }

    // implementing ActionListener
        public void actionPerformed(ActionEvent event) {
            setVisible(false);
            dispose();
        }
    }

    /**
     * the main method
     */
    public static void main(String[] argv) {
        // create frame
        JavaEdit frame = new JavaEdit();
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(size.width-80, size.height-80);
        frame.setLocation(20, 20);

        // add window closing listener

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

     // show the frame
        frame.setVisible(true);
    }
}
java swing jfilechooser dialogs