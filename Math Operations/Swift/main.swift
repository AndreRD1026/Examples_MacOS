var opt = 0
var runLopp = false
repeat{
    print("--------Menu--------")
        print("1. Addition")
        print("2. Subtraction")
        print("3. Multiplication")
        print("4. Division")
        print("5. Exit")
        print("Select one option: ") 
        let opt = readLine()
        switch opt {
        case "1":
            print("\nEnter the first number: ")
            let nmber1 = readLine()!
            let fnmber1 = Float(nmber1)! //Cast the input string to float
            print("\nEnter the second number: ")
            let nmber2 = readLine()!
            let fnmber2 = Float(nmber2)! //Cast the input string to float
            let add = fnmber1 + fnmber2 //Do the sum
            print("\nThe result is: ", add)
            print("")
         
        case "2":
            print("\nEnter the first number: ")
            let nmber1 = readLine()!
            let fnmber1 = Float(nmber1)! //Cast the input string to float
            print("\nEnter the second number: ")
            let nmber2 = readLine()!
            let fnmber2 = Float(nmber2)! //Cast the input string to float
            let subtraction = fnmber1 - fnmber2 //Do the subtraction
            print("\nThe result is: ", subtraction)
            print("")

        case "3":
            print("\nEnter the first number: ")
            let nmber1 = readLine()!
            let fnmber1 = Float(nmber1)! //Cast the input string to float
            print("\nEnter the second number: ")
            let nmber2 = readLine()!
            let fnmber2 = Float(nmber2)! //Cast the input string to float
            let product = fnmber1 * fnmber2 //Do the product
            print("\nThe result is: ", product)
            print("")

        case "4":
            print("\nEnter the first number: ")
            let nmber1 = readLine()! 
            let fnmber1 = Float(nmber1)! //Cast the input string to float
            print("\nEnter the second number: ")
            let nmber2 = readLine()!
            let fnmber2 = Float(nmber2)! //Cast the input string to float

            if fnmber2 == 0{ // Verify if number 2 is equal to 0
                print("\nCan't divide by 0")
                print("")
            }else{
                let division = fnmber1 / fnmber2 //Do the division
                print("\nThe result is: ", division)
                print("")
            }

        case "5":
            print("\nFinish Program\n")
            runLopp = true
            
        default:
            print("\nNeed to choice one option of the menu\n")
        }            
}while(runLopp==false)