/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitaires;

/**
 *
 * @author Mitia
 */
public class Utilities {
    public static String[] getUrl(String Url){
        if (Url==null) {
            String[] url={"/"};
            return url;
        }
        return Url.split("/");
    }
}
