import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author REIGE
 * @date 2018/1/27.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        String BLANK = "  ";
        Process process = Runtime.getRuntime().exec("cmd /k"+BLANK+
                "C:/Users/REIGE/IdeaProjects/SpringLearning/saveHtmlImage/src/other/phantomjs" + BLANK //你的phantomjs.exe路径
                        + "C:/Users/REIGE/IdeaProjects/SpringLearning/saveHtmlImage/src/other/save-whole-page.js" + BLANK //就是上文中那段javascript脚本的存放路径
                        + "https://www.baidu.com" + BLANK //你的目标url地址
                        + "C:/Users/REIGE/IdeaProjects/SpringLearning/saveHtmlImage/src/other/aaa.png");//你的图片输出路径
//      Process process = Runtime.getRuntime().exec("cmd /c dir");
        InputStream inputStream = process.getInputStream();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        InputStreamReader is = new InputStreamReader(inputStream);
        char[] buf=new char[1024];
        int num;
        while ((num=is.read(buf))!=-1) {
            System.out.println(buf);
        }
/*        byte[] buf=new byte[1024];
        int num=0;
        while ((num=fis.read(buf))!=-1) {
            fis.write(buf,0,num);
        }*/
/*        String tmp = "";
        while ((tmp = reader.readLine()) != null) {
            System.out.println(tmp);
            if (reader != null) {
                reader.close();
            }
            if (process != null) {
                process.destroy();
                process = null;
            }
        }*/
    }
}
