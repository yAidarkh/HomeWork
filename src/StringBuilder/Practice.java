package StringBuilder;

public class Practice {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("misha", 20, new Post[]{
                        new Post("пост misha 1", "2009-09-06"),
                        new Post("пост misha 2", "2013-05-06"),

                }),
                new User("anya", 22, new Post[]{
                        new Post("пост anya 1", "2009-09-06"),
                        new Post("пост anya 2", "2009-09-06"),
                        new Post("пост anya 3", "2009-09-06"),
                }),
                new User("grisha", 28, new Post[]{
                        new Post("пост grisha 1", null),
                }),
                new User("aldiyar", 35, new Post[]{}),
        };
        StringBuilder stringBuilder = new StringBuilder("users = [");
        for (int i = 0; i < users.length; i++) {
            stringBuilder.append("{\"name\": \"").append(users[i].getName()).append("\", \"age\": \"").append(users[i].getAge()).append("\", ").append("\"posts\": [{");
            for (int j = 0; j < users[i].getPosts().length; j++) {
                stringBuilder.append("\"title\": \"").append(users[i].getPosts()[j].getTitle()).append("\", ").append("\"posted_at\": \"").append(users[i].getPosts()[j].getPostedAt()).append("\"");
                if (j==users[i].getPosts().length-1){
                    stringBuilder.append("}]");
                }else {
                    stringBuilder.append(", ");
                }
            }
            if (i==users.length-1){
                stringBuilder.append("]");
            }else {
                stringBuilder.append(", ");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
