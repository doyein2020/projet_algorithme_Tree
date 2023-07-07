public class Main {
    public static void main(String[] args) {
        // Création de la structure de dossiers et fichiers
        Folder root = new Folder("Root");

        Folder folder1 = new Folder("Folder 1");
        Folder folder2 = new Folder("Folder 2");
        Folder folder3 = new Folder("Folder 3");
        Folder folder4 = new Folder("Folder 4");
        Folder folder5 = new Folder("Folder 5");

        File file1 = new File("File 1");
        File file2 = new File("File 2");
        File file3 = new File("File 3");
        File file4 = new File("File 4");
        File file5 = new File("File 5");
        File file6 = new File("File 6");
        File file7 = new File("File 7");
        File file8 = new File("File 8");

        root.addComponent(folder1);
        root.addComponent(folder2);
        root.addComponent(file1);
        root.addComponent(folder5);


         folder5.addComponent(file2);
         folder5.addComponent(file5);
         folder5.addComponent(file7);
         folder5.addComponent(file6);
         folder5.addComponent(file8);
         folder5.addComponent(folder3);
         folder5.addComponent(folder4);

        root.addComponent(folder5);

        folder1.addComponent(file2);
        folder1.addComponent(folder3);
        folder2.addComponent(file3);
        folder3.addComponent(file4);

        // Affichage de la structure de dossiers et fichiers
        root.display("");
    }
}






