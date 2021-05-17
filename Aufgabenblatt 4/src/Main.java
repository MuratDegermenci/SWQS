public class Main {
        public static void main(String[] args){
            StackMapEntry stackMapEntry = new StackMapEntry(0, 1, new String[]{"a","b"}, new String[]{"c"});
            StackMapEntry stackMapEntry1 = new StackMapEntry(2, 3, new String[]{"a", "b"}, new String[]{});
            stackMapEntry.toString();
            stackMapEntry1.toString();
            System.out.println(stackMapEntry);
            System.out.println(stackMapEntry1);
        }
    }
