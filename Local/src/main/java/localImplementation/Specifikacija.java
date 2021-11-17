package localImplementation;

import java.util.List;

public interface Specifikacija {
    //inicijalizacija
    int connectStorage(String Path); // check if existing, update config.occupied
    int initStorage(String Path); // create config and folder
    int promptInitStorage(String Path); // ask if they want to create a storage
    int createUser(String Username, String Password, int Permission);
    int requestLogin(); // request credntials upon accessing
    int requestNewUser(); // create new user upon init
    int hasPermission( String Path, int Permission, int Action); // weigh action over permission under path
    int disconnectStorage(); // leave storage, update config.occupied
    int checkOccupied(); //  config.occupied
    int createFile(String name, String destPath); //empty file
    int createFolder(String name, String destPath);
    int uploadFile(String srcPath, String destPath);
    int uploadFiles(List<String> srcPaths, List<String> destPaths);
    int deleteFile(String path);
    int deleteFolder(String path);
    List<String> listFiles(String path);
    int moveFile(String srcPath, String destPath);
    int downloadPath(String srcPath, String destPath);
    int downloadFolder(String srcPath, String destPath);
    int downloadFile(String srcPath, String destPath);
    int setStorageSize(int Bytes);
    int checkStorageSizeLimit(int FileSize); // added size
    int addStorageSizeCount(int Bytes);
    int removeStorageSizeCount(int Bytes);
    int addExtensionBan(String ext);
    int removeExtensionBan(String ext);
    int extensionAllowed(String ext); // check if extension allowed
    int setFileCountLimit(int Limit);
    int checkFileCountLimit(int FileCount);
    int addFileLimitCount(int FileCount);
    int removeFileLimitCount(int FileCount);
    int addFileSizeLimit(int FileSize);
    int checkFileSizeLimit(int FileSize);
}