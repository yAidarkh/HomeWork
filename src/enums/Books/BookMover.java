package enums.Books;

import java.util.Scanner;

public class BookMover {
    public boolean bookMover(Book book, Status status){
        return false;
    }
    public void bookMenu(Book book){
        System.out.println("Прошу выбрать желаемый статус для книги: "+book.getTitle());
        showStatusList();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Выбретие статус: ");
        while (true){
        int answer = scanner.nextInt();
        if (answer>=1&&answer<=4){
            changeStatus(book,wichStatus(answer));
            return;
        }

        }


    }
    protected void changeStatus(Book book,Status status){
        Status bookStatusBefore = book.getStatus();
        switch (book.getStatus()){
            case ARCHIVED:
                FromArchivedStatusMover archivedMover = new FromArchivedStatusMover();
                if(archivedMover.bookMover(book,status)){
                    System.out.println("Статус книги изменен с "+bookStatusBefore+ " на " +status);
                    break;
                }
                System.out.println("Перевод книги из статуса "+bookStatusBefore+" в статус "+status+" невозможен");
                break;
            case BORROWED:
                FromBorrowedStatusMover borrowedStatusMover = new FromBorrowedStatusMover();
                if(borrowedStatusMover.bookMover(book,status)){
                    System.out.println("Статус книги изменен с "+bookStatusBefore+ " на " +status);
                    break;
                }
                System.out.println("Перевод книги из статуса "+bookStatusBefore+" в статус "+status+" невозможен");
                break;
            case AVIABLE:
                FromAviableStatusMover aviableStatusMover = new FromAviableStatusMover();
                if(aviableStatusMover.bookMover(book,status)){
                    System.out.println("Статус книги изменен с "+bookStatusBefore+ " на " +status);
                    break;
                }
                System.out.println("Перевод книги из статуса "+bookStatusBefore+" в статус "+status+" невозможен");
                break;
            case OVERDUED:
                FromOverduedStatusMover overduedStatusMover = new FromOverduedStatusMover();
                if(overduedStatusMover.bookMover(book,status)){
                    System.out.println("Статус книги изменен с "+bookStatusBefore+ " на " +status);
                    break;
                }
                System.out.println("Перевод книги из статуса "+bookStatusBefore+" в статус "+status+" невозможен");
                break;
        }
    }
    protected Status wichStatus(int i){
        switch (i){
            case 1:
                return Status.BORROWED;
            case 2:
                return Status.ARCHIVED;
            case 3:
                return Status.AVIABLE;
            case 4:
                return Status.OVERDUED;
            default:
                return null;
        }
    }

    protected void showStatusList(){
        int count = 1;
        for(Status s:Status.values()){
            System.out.println(count+". "+s.getRusName());
            count++;
        }
    }
}
