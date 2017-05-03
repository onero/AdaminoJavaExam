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
    public int getUserChoice() {
        System.out.println("Please select one of the following options: ");
        System.out.println("1) Display all songs");
        System.out.println("2) Add song");
        int userChoice = Console.Readers.readInt("Your choice: ");
        return userChoice;
    }

}
