#========================= Global Var===============================
alltext = ''

#==========================Using functions==========================

#Function that get the content of local file
def readf():
    global alltext
    file = open("text.txt", "r")
    alltext = file.read()
    print("Successful upload")

# Function that get the path and open the file
def readfilepath():
    global alltext
    Filename = input('Put the path of file: ')
    file = Filename
    print("Successful upload")
    content = open(file, "r")
    alltext = content.read()


#========================== Menu ==========================
def menu():
    opt = ''
    while opt != '4':
        print("--------Menu--------")
        print("1. Read Local File")
        print("2. Read File with Path")
        print("3. See Content")
        print("4. Exit")
        opt = input("Select one option: ")
        if opt == '1':
            readf()
        elif opt == '2':
            readfilepath()
        elif opt == '3':
            if alltext == '':
                print("Need read a file before")
            else:
                print(alltext)
        elif opt != "4":
            print("\nNeed to choice one option of the menu\n") 
        else:
            print("\nFinish Program\n")
            break

menu()