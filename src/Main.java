public class Main {
    private static int[] arr = new int[]{};

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;
        String fullName2 = firstName.concat(" ").concat(lastName);
        String fullName3 = String.join(" ", firstName, lastName);
        String fullName4 = "John Doe";
        String fullName5 = "John " + lastName;
        String fullName6 = "John" + " " + "Doe";
        

        System.out.println(System.identityHashCode(fullName));
        System.out.println(System.identityHashCode(fullName2));
        System.out.println(System.identityHashCode(fullName3));
        System.out.println(System.identityHashCode(fullName4));
        System.out.println(System.identityHashCode(fullName5));
        System.out.println(System.identityHashCode(fullName6));

        System.out.println("fullName == fullName2: "+(fullName == fullName2));
        System.out.println("fullName == fullName3: "+(fullName == fullName3));
        System.out.println("fullName == fullName4: "+(fullName == fullName4));
        System.out.println("fullName == fullName5: "+(fullName == fullName5));
        System.out.println("fullName == fullName6: "+(fullName == fullName6));

        System.out.println("fullName.equals(fullName2): "+(fullName.equals(fullName2)));
        System.out.println("fullName.equals(fullName3): "+(fullName.equals(fullName3)));
        System.out.println("fullName.equals(fullName4): "+(fullName.equals(fullName4)));
        System.out.println("fullName.equals(fullName5): "+(fullName.equals(fullName5)));
        System.out.println("fullName.equals(fullName6): "+(fullName.equals(fullName6)));





















//        String s = new String("Hello");
//        System.out.println(System.identityHashCode(s));
//        List<String> list = new ArrayList<>();
//        list.add(s);
//        String s1 = new String("Hello");
//        System.out.println(System.identityHashCode(s1));
//        list.add(s1);
//        list.add(s);
//        System.out.println(System.identityHashCode(s));
//
//        list.add(s.replace("l", "L"));
//
//        System.out.println(list.size());
//        System.out.println(list);
    }
}