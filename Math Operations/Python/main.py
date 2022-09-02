def menu():
    opt = ''
    while opt != '5':
        print("--------Menu--------")
        print("1. Addition")
        print("2. Subtraction")
        print("3. Multiplication")
        print("4. Division")
        print("5. Exit")
        opt = input("Select one option: ")
        if opt == '1':
            print("\nEnter the first number: ")
            nmber1 = float(input())
            print("\nEnter the second number: ")
            nmber2 = float(input())
            add = nmber1 + nmber2 #Do the sum
            print("\nThe result is: " + str(add) + "\n")

        elif opt == '2':
            print("\nEnter the first number: ")
            nmber1 = float(input())
            print("\nEnter the second number: ")
            nmber2 = float(input())
            less = nmber1 - nmber2 #Do the subtraction
            print("\nThe result is: " + str(less) + "\n")

        elif opt == '3':
            print("\nEnter the first number: ")
            nmber1 = float(input())
            print("\nEnter the second number: ")
            nmber2 = float(input())
            product = nmber1 * nmber2 #Do the product
            print("\nThe result is: " + str(product) + "\n")

        elif opt == "4":
            print("\nEnter the first number: ")
            nmber1 = float(input())
            print("\nEnter the second number: ")
            nmber2 = float(input())
            if (nmber2==0): # Verify if number 2 is equal to 0
                print("\nCan't divide by 0\n")
            else:
                division = nmber1 / nmber2 #Do the division
                print("\nThe result is: " + str(division) + "\n")
            
        elif opt != "5":
            print("\nNeed to choice one option of the menu\n")
            
        else:
            print("\nFinish Program\n")
            break
menu()