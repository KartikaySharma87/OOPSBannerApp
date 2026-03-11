/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 * * This use case implements a modular approach to generate each 
 * letter's pattern through dedicated methods for reusability.
 */

public class OOPSBANNERAPP6 {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  *** ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  *** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " ** ** ",
            " ** ** ",
            " ***** ",
            " ** ",
            " ** ",
            " ** "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  **** ",
            " ** ** ",
            "  ** ",
            "   ** ",
            "    ** ",
            " ** ** ",
            "  **** "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {
        
        // 1. Get the patterns by calling the methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // 2. Use a loop to assemble each line of the banner
        // We assume all letter arrays have the same number of lines (7)
        for (int i = 0; i < oPattern.length; i++) {
            // Print line i of O, O, P, and S with spaces in between
            System.out.println(
                oPattern[i] + "  " + 
                oPattern[i] + "  " + 
                pPattern[i] + "  " + 
                sPattern[i]
            );
        }
    }
}