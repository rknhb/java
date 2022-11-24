public class RecorderRunner {
    public static void main(String[] args) {
        Recorder recoder = new Recorder();

        System.out.println("=================");
        System.out.println("=== set & get ===");
        System.out.println("=================");

        recoder.put("key1", "value1");
        recoder.get("key1");

        System.out.println("");
        System.out.println("=======================");
        System.out.println("=== get unknown key ===");
        System.out.println("=======================");

        try {
            recoder.get("unknown");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("====================");
        System.out.println("=== set & delete ===");
        System.out.println("====================");

        recoder.put("key2", "will delete");
        recoder.delete("key2");

        System.out.println("");
        System.out.println("==========================");
        System.out.println("=== delete unknown key ===");
        System.out.println("==========================");

        try {
            recoder.get("key2");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("========================");
        System.out.println("=== delete all & get ===");
        System.out.println("========================");

        recoder.delete();

        try {
            recoder.get("key1");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}