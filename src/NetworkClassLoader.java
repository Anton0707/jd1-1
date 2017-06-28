/**
 * Created by admin on 6/23/17.
 */
public class NetworkClassLoader extends ClassLoader {
    String host;
    int port;

    public NetworkClassLoader(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Class findClass(String className) {
        byte[] bytes = loadClassData(className);
        return defineClass(className, bytes, 0, bytes.length);
    }



    private byte[] loadClassData(String className) {
        byte[] result = null;
        return result;
    }

    public static void classLoaderDemo() {
        try {
            ClassLoader loader = new NetworkClassLoader("www.tut.by", 8080);
            Object main = loader.loadClass("Main").newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
