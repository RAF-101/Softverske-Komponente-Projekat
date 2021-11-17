package localImplementation;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Local implements Specifikacija {



    public Local(){
    }

    public int initStorage(String Path) {

        return 0;
    }

    public int promptInitStorage(String Path) {
        System.out.println("Storage under the provided path was not found. Do you want to create it?");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        if( answer.toLowerCase().contains("y") || answer.toLowerCase().contains("yes") ){
            return initStorage(Path);
        }else{
            return 1; // error, not found
        }
    }

    public int connectStorage(String Path) {
        if(Files.exists(java.nio.file.Path.of(Path)) ){
            return 0;
        }else{
            return promptInitStorage(Path);
        }
    }

    public int createUser(String Username, String Password, int Permission) {

        return 0;
    }

    public int requestLogin() {

        return 0;
    }

    public int requestNewUser() {

        return 0;
    }

    public int hasPermission(String Path, int Permission, int Action) {

        return 0;
    }

    public int disconnectStorage() {

        return 0;
    }

    public int checkOccupied() {

        return 0;
    }

    public int createFile(String name, String destPath) {

        return 0;
    }

    public int createFolder(String name, String destPath) {

        return 0;
    }

    public int uploadFile(String srcPath, String destPath) {

        return 0;
    }

    public int uploadFiles(List<String> srcPaths, List<String> destPaths) {

        return 0;
    }

    public int deleteFile(String path) {

        return 0;
    }

    public int deleteFolder(String path) {

        return 0;
    }

    public List<String> listFiles(String path) {

        return null;
    }

    public int moveFile(String srcPath, String destPath) {

        return 0;
    }

    public int downloadPath(String srcPath, String destPath) {

        return 0;
    }

    public int downloadFolder(String srcPath, String destPath) {

        return 0;
    }

    public int downloadFile(String srcPath, String destPath) {

        return 0;
    }

    public int setStorageSize(int Bytes) {

        return 0;
    }

    public int checkStorageSizeLimit(int FileSize) {

        return 0;
    }

    public int addStorageSizeCount(int Bytes) {

        return 0;
    }

    public int removeStorageSizeCount(int Bytes) {

        return 0;
    }

    public int addExtensionBan(String ext) {

        return 0;
    }

    public int removeExtensionBan(String ext) {

        return 0;
    }

    public int extensionAllowed(String ext) {

        return 0;
    }

    public int setFileCountLimit(int Limit) {

        return 0;
    }

    public int checkFileCountLimit(int FileCount) {

        return 0;
    }

    public int addFileLimitCount(int FileCount) {

        return 0;
    }

    public int removeFileLimitCount(int FileCount) {

        return 0;
    }

    public int addFileSizeLimit(int FileSize) {

        return 0;
    }

    public int checkFileSizeLimit(int FileSize) {

        return 0;
    }
}
