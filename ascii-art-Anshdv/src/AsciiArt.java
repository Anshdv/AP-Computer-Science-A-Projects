public class AsciiArt {
    public static void main(String[] args) {
        // This works on my Mac. It might look weird on Windows or Github, but it's supposed to be a house.
        System.out.println();
        System.out.println("""
                      /\\̅  ̅  ̅  ̅  ̅  ̅  ̅  ̅  ̅  ̅  ̅  ̅  ̅  \\
                     /  \\  ######################  \\
                    /    \\  ######################  \\
                   / |̅ |  \\  ######################  \\
                  /  | |   \\  ######################  \\
                 /   |_|    \\  ######################  \\
                /____________\\__________________________\\
                |            |                          |
                |            |                          |
                |  |̅  ̅  ̅  |  |   |̅  ̅ |̅  ̅ |  |̅  ̅ |̅  ̅ |   |
                |  |      |  |   |—— + ——|  |—— + ——|   |
                |  | •    |  |   |_ _|_ _|  |_ _|_ _|   |
                |  |      |  |                          |
                |__|______|__|__________________________|
                """);
    }
}
