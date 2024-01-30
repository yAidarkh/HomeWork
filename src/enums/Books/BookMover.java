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
        BookMover mover = wichBookMover(book.getStatus());
        if(mover.bookMover(book,status)){
            System.out.println("Статус книги изменен с "+bookStatusBefore+ " на " +status);
        }else{
            System.out.println("Перевод книги из статуса "+bookStatusBefore+" в статус "+status+" невозможен");
        }



    }
    protected BookMover wichBookMover(Status status){
        switch (status){
            case BORROWED:
                return new FromBorrowedStatusMover();
            case ARCHIVED:
                return new FromArchivedStatusMover();
            case AVIABLE:
                return new FromAviableStatusMover();
            case OVERDUED:
                return new FromOverduedStatusMover();
            default:
                return null;
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
