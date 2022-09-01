def menu():
    opt = ''
    while opt != '4':  # repeat the menu
        print("--------Menu--------")
        print("1. First opc")
        print("2. Second opc")
        print("3. Third opc")
        print("4. Exit")
        opt = input("Select one option: ") # get input number
        if opt == '1':
            print("\nEnter to option 1\n")
        elif opt == '2':
            print("\nEnter to option 2\n")
        elif opt == '3':
            print("\nEnter to option 3\n")
        elif opt != "4":
            print("\nNeed to choice one option of the menu\n") # When you put another number differents 1 to 4
        else:
            print("\nFinish Program\n") # Finish the loop when you put number 4
            break
menu()