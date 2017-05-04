/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam.gui.view;

public class UserMenu {

    /**
     * Get the user input for options
     *
     * @return
     */
    public static int getUserChoice() {
        System.out.println();
        System.out.println("Please select one of the following options: ");
        System.out.println("0) Exit");
        System.out.println("1) Add song");
        System.out.println("2) Display all songs");
        System.out.println("3) Update a song");
        System.out.println("4) Delete a song");
        System.out.println();
        int userChoice = Console.Readers.readInt("Your choice: ");
        return userChoice;
    }

}
