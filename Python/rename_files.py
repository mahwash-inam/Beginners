import os
def rename_files():
    file_list = os.listdir(r"F:\New\prank")
    #print(file_list)
    saved_path=os.getcwd()
    print("Current directory is"+saved_path)
    os.chdir(r"F:\New\prank")

    trantab = str.maketrans(dict.fromkeys('0123456789'))

    for file_name in file_list:
        print("Old Name-" + file_name)
        print("New Name-" + file_name.translate(trantab))
        os.rename(file_name, file_name.translate(trantab))
    os.chdir(saved_path)

rename_files()
