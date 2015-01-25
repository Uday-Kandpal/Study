package study;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Uday Kandpal
 */
public class ConfigurationReader {

    private String name = "";
    private BufferedReader br;
    private int BUFFER_SIZE = 100000;
    private int NOW_ITS_LIMIT = 500000;

    public ConfigurationReader(String name) throws FileNotFoundException {
        this.name = name;
        br = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
    }

    private char[] read(int howMany) throws IOException {
        int count = 0, c;
        char[] cx = new char[howMany];
        while (howMany != count) {
            c = br.read();
            if (c == -1) {
                return cx;
            }
            cx[count++] = (char) c;
        }
        return cx;
    }

    private String readString(int howMany) throws IOException {
        return new String(read(howMany));
    }

    private char[] readUntil(char omg) throws IOException {
        int c;
        int i = 0;
        int k = 0;
        char cx[] = new char[BUFFER_SIZE];
        while ((c = br.read()) != -1 && omg != (char) c) {
            if (k >= NOW_ITS_LIMIT) {
                break;
            }
            cx[(i + 1) % BUFFER_SIZE] = (char) c;
            i++;
            k++;
        }
        char s[] = new char[k];
        System.arraycopy(cx, 0, s, 0, k);
        return s;
    }

    private String readUntilIntoString(char omg) throws IOException {
        return new String(readUntil(omg));
    }

    private String[] readLines(int howMany) throws IOException {
        String iAmThere[] = new String[howMany];
        int i;
        for (i = 0; i < howMany; i++) {
            iAmThere[i] = readUntilIntoString('\n');
        }
        String s[] = new String[i];
        System.arraycopy(iAmThere, 0, s, 0, i);
        return s;//iAmThere;
    }

    public String[] separateByChar(String line, char c) {
        String iAmMulti[] = new String[line.length()];
        StringBuffer single = new StringBuffer();
        int k = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == c) {
                iAmMulti[k++] = single.toString();
                if (iAmMulti[k - 1].trim().isEmpty()) {
                    k--;
                }
                single = new StringBuffer();
                continue;
            }
            single.append(line.charAt(i));
        }
        iAmMulti[k++] = single.toString();
        String hello[] = new String[k];
        System.arraycopy(iAmMulti, 0, hello, 0, k);
        return hello;
    }

    public boolean isCorrect(String x) {
        String regex = "([\n\t ]*\\.conf[\n\t ]*\\{[\n\t ]*<[\n\t ]*map[\n\t ]*>[\n\t ]*<[\n\t ]*(key[\n\t ]*>[^.]*</[\n\t ]*key[\n\t ]*>[\n\t ]*<[\n\t ]*values[\n\t ]*>[^.]*</[\n\t ]*values[\n\t ]*>)+[\n\t ]*</[\n\t ]*map[\n\t ]*>[\n\t ]*\\}[^.]*)|()";    //System.out.println(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(x);
        return m.matches();
    }

    private String[] getKeySet(String x) {
        x = x.replaceAll("([\n\t ]*\\.conf\\{)", "").replaceAll("([\n\t ]*\\}[\n\t ]*)", "");
        x = x.replaceAll("<[\n\t ]*values[\n\t ]*>", "").replaceAll("</[\n\t ]*values[\n\t ]*>", "%");
        x = x.replaceAll("<[\n\t ]*map[\n\t ]*>", "").replaceAll("</[\n\t ]*map[\n\t ]*>", "%");
        x = x.replaceAll("<[\n\t ]*key[\n\t ]*>", "").replaceAll("</[\n\t ]*key[\n\t ]*>", "%");
        x = x.replace("%%", "");
        String xx[] = separateByChar(x, '%');
        int l = ((xx.length / 2) + (xx.length % 2));
        String y[] = new String[l];
        for (int i = 0, j = 0; i < l; i++, j += 2) {
            y[i] = xx[j];
        }
        return y;
    }

    private String[] getValuesSet(String x) {
        x = x.replaceAll("([\n\t ]*\\.conf\\{)", "").replaceAll("([\n\t ]*\\}[\n\t ]*)", "");
        x = x.replaceAll("<[\n\t ]*values[\n\t ]*>", "").replaceAll("</[\n\t ]*values[\n\t ]*>", "%");
        x = x.replaceAll("<[\n\t ]*map[\n\t ]*>", "").replaceAll("</[\n\t ]*map[\n\t ]*>", "%");
        x = x.replaceAll("<[\n\t ]*key[\n\t ]*>", "").replaceAll("</[\n\t ]*key[\n\t ]*>", "%");
        x = x.replace("%%", "");
        String xx[] = separateByChar(x, '%');
        int l = ((xx.length / 2));
        String y[] = new String[l];
        for (int i = 0, j = 1; i < l; i++, j += 2) {
            y[i] = xx[j];
        }
        return y;
    }

    private HashMap<String, String> getMap(String x) {
        HashMap<String, String> map = new HashMap<>();
        String y[] = getKeySet(x);
        String z[] = getValuesSet(x);
        int n = Math.min(y.length, z.length);
        for (int i = 0; i < n; i++) {
            map.put(y[i], z[i]);
        }
        return map;
    }
    
    public HashMap<String, String> generateConfigurationMap(){
            return getMap(Functions.File_Output(name));
    }
    /*  driver function to test the files*/

    public static void main(String args[]) throws FileNotFoundException, IOException {
        ConfigurationReader c;
        c = new ConfigurationReader("file.conf");
        //System.out.println(c.isCorrect(".conf{<map><key></key><values></values></map>}"));
        System.out.println(c.getMap(".conf{<map><key>First Name : </key><values>Udaysagar</values><key>Last name :</key><values>Kandpal</values></map>}"));
    }
}
