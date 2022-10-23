package sutton.IO.baseIo.useFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 14:09
 **/
public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}


/**
 * 文件过滤器
 */
class DirFilter implements FilenameFilter {

    /**
     * 正则表达式
     */
    private Pattern pattern;


    /**
     * 传递表达式
     *
     * @param regex
     */
    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    /**
     * @param dir  the directory in which the file was found.
     * @param name the name of the file.
     * @return
     */
    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
