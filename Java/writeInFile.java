public static void writeInFile(String fileName, String text){
    try {
    File myObj = new File(fileName);
    if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
    } else {
        System.out.println("File already exists.");
    }
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

    try {
        FileWriter myWriter = new FileWriter(fileName);
        myWriter.write(text);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}