package iohandling;

import java.io.File;
import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class FilePermissionDemo {

    public static void main(String[] args) {

        File file = new File("src/output.txt");
        System.out.println(file.canExecute());

        FilePermission executePermission = new FilePermission("src/output.txt", "execute");
        FilePermission readPermission = new FilePermission("src/output.txt", "read");

        PermissionCollection permissionCollection = executePermission.newPermissionCollection();
        permissionCollection.add(executePermission);
        permissionCollection.add(readPermission);

        if (permissionCollection.implies(new FilePermission("src/output.txt", "execute"))) {
            System.out.println("Granted");
        } else {
            System.out.println("Not Granted");
        }
    }
}
