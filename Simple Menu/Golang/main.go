package main

import (
	"fmt"
	"os"
)

func main() {

	for { // repeat the menu
		fmt.Println("--------Menu--------")
		fmt.Println("1. First opc")
		fmt.Println("2. Second opc")
		fmt.Println("3. Third opc")
		fmt.Println("4. Exit")
		fmt.Printf("Select one option: ")
		var input int
		opt, err := fmt.Scanln(&input) // get input number
		if opt < 1 || err != nil {
			fmt.Println("Invalid nummber")
			return
		}
		switch input {
		case 1:
			fmt.Println("\nEnter to option 1")
			fmt.Println("")
			break
		case 2:
			fmt.Println("\nEnter to option 2")
			fmt.Println("")
			break
		case 3:
			fmt.Println("\nEnter to option 3")
			fmt.Println("")
			break
		case 4:
			fmt.Println("\nFinish Program")
			fmt.Println("")
			os.Exit(0) // To finish the loop
			break
		default:
			fmt.Println("\nNeed to choice one option of the menu") //When you put another number differents 1 to 4
			fmt.Println("")
			break
		}
	}
}
