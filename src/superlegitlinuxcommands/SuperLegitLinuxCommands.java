/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superlegitlinuxcommands;

/**
 *
 * @author 811343
 */
public class SuperLegitLinuxCommands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String superLegitLinuxCommands[] = {
            "touch", // create a new empty file
            "unzip", // unzip a zip file
            "finger", // non-standard tool for looking at currently logged in user information
            "mount", // attach a hard drive to a folder
            "fsck", // File System ChecK
            "yes", // repeats the letter 'y' until terminated
            "yes", // repeats the letter 'y' until terminated
            "yes", // repeats the letter 'y' until terminated
            "zip", // create a zip file
            "clean", // non-standard tool to cleanup the /tmp directory and uninstall packages that are no longer used
        };
        for (String lc : superLegitLinuxCommands) {
            System.out.println(lc);
        }
    }
    
}
