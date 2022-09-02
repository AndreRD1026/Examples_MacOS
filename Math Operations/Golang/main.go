package main

import (
	"fmt"
	"os"
)

func main() {

	for {
		fmt.Println("--------Menu--------")
		fmt.Println("1. Addition")
		fmt.Println("2. Subtraction")
		fmt.Println("3. Multiplication")
		fmt.Println("4. Division")
		fmt.Println("5. Exit")
		fmt.Printf("Select one option: ")
		var input int
		var nmber1, nmber2 float32
		opt, err := fmt.Scanln(&input)
		if opt < 1 || err != nil {
			fmt.Println("Invalid nummber")
			return
		}
		switch input {
		case 1:
			fmt.Println("")
			fmt.Print("Enter the first number: ")
			fmt.Scanln(&nmber1)
			fmt.Println("")
			fmt.Print("Enter the second number: ")
			fmt.Scanln(&nmber2)
			add := nmber1 + nmber2 //Do the sum
			fmt.Println("")
			fmt.Println("The result is: ", add)
			fmt.Println("")
			break

		case 2:
			fmt.Println("")
			fmt.Print("Enter the first number: ")
			fmt.Scanln(&nmber1)
			fmt.Println("")
			fmt.Print("Enter the second number: ")
			fmt.Scanln(&nmber2)
			subtraction := nmber1 - nmber2 //Do the subtraction
			fmt.Println("")
			fmt.Println("The result is: ", subtraction)
			fmt.Println("")
			break

		case 3:
			fmt.Println("")
			fmt.Print("Enter the first number: ")
			fmt.Scanln(&nmber1)
			fmt.Println("")
			fmt.Print("Enter the second number: ")
			fmt.Scanln(&nmber2)
			product := nmber1 * nmber2 //Do the product
			fmt.Println("")
			fmt.Println("The result is: ", product)
			fmt.Println("")
			break

		case 4:
			fmt.Println("")
			fmt.Print("Enter the first number: ")
			fmt.Scanln(&nmber1)
			fmt.Println("")
			fmt.Print("Enter the second number: ")
			fmt.Scanln(&nmber2)
			if nmber2 == 0 { // Verify if number 2 is equal to 0
				fmt.Println("")
				fmt.Println("Can't divide by 0")
				fmt.Println()
			} else {
				division := nmber1 / nmber2 //Do the division
				fmt.Println("")
				fmt.Println("The result is: ", division)
				fmt.Println("")
			}
			break

		case 5:
			fmt.Println("")
			fmt.Println("\nFinish Program")
			fmt.Println("")
			os.Exit(0)
			break

		default:
			fmt.Println("")
			fmt.Println("\nNeed to choice one option of the menu")
			fmt.Println("")
			break
		}
	}
}
