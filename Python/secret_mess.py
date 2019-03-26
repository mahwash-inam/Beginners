import os

def secret_mess():
    file_list = os.listdir(r"F:\alphabet\SECRET")
    saved_path= os.getcwd()
    print("Current working directory:"+saved_path)
    os.chdir(r"F:\alphabet\SECRET")

    change = str.maketrans(dict.fromkeys('0123456789'))

    for file_name in file_list:
        print("Old Name:"+ file_name)
        print("New Name:"+ file_name.translate(change))
        os.rename(file_name, file_name.translate(change))
    os.chdir(saved_path)


secret_mess()
