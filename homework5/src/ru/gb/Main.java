package ru.gb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        try {
            makeBackup("resource");
            int[] arr = {1, 0, 2, 1, 2, 3, 1, 2, 0};
            saveTTTGame(arr, "resource/saveTTT.sav");
            int[] returnArr = loadTTTGame("resource/saveTTT.sav");
            for (int e : returnArr) {
                System.out.print(e + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void makeBackup(String path) throws Exception {
        String backupString = "backup";
        Path directoryToBackup = Paths.get(path);
        if (Files.isDirectory(directoryToBackup)) {
            Path backup = Path.of(path, backupString);
            if (!Files.exists(backup)) {
                backup = Files.createDirectory(backup);
            }
            try (Stream<Path> strm = Files.list(directoryToBackup)) {
                List<Path> fileList = strm.filter(el -> !(Files.isDirectory(el))).toList();
                for (Path el : fileList) {
                    Path destPath = Path.of(backup.toString(), el.getName(1).toString());
                    Files.copy(el, destPath, StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
    }

    static boolean saveTTTGame(int[] inpArr, String path) {
        try (FileOutputStream fs = new FileOutputStream(path)) {
            byte[] byteArr = new byte[3];
            for (int i = 0; i < inpArr.length; i += 3) {
                byte b = 0;
                for (int j = 0; j < 3; j++) {
                    b += (byte) (inpArr[i + j] << (j * 3));
                }
                byteArr[i / 3] = b;
            }
            fs.write(byteArr);
            fs.flush();
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    static int[] loadTTTGame(String path) {
        int[] result = new int[9];
        int index = 0;
        try (FileInputStream fis = new FileInputStream(path)) {
            byte[] byteArr = fis.readAllBytes();
            for (byte b: byteArr) {
                for (int i = 0; i < 3; i++) {
                    result[index] = (b >> (i * 3)) & 3;
                    index++;
                }
            }
            return result;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


}