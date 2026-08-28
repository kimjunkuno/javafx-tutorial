public class Duke {
    private String commandType = "";

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        commandType = getCommandType(input);
        return "Duke heard: " + input;
    }

    public String getCommandType() {
        return commandType;
    }

    private String getCommandType(String input) {
        if (input == null || input.isBlank()) {
            return "";
        }

        String commandWord = input.trim().split("\\s+", 2)[0].toLowerCase();
        switch (commandWord) {
        case "todo":
        case "deadline":
        case "event":
            return "AddCommand";
        case "mark":
        case "unmark":
            return "ChangeMarkCommand";
        case "delete":
            return "DeleteCommand";
        default:
            return "";
        }
    }
}
