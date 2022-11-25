import jakarta.persistence.*;

import java.util.Date;


@Entity
public class items {
    private int card_Id;
    private String item1;
    private String item2;
    private Date date;

    public int getCard_Id() {
        return card_Id;
    }

    public void setCard_Id(int card_Id) {
        this.card_Id = card_Id;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public static  void main(String[] args){
        items it=new items();
        it.setCard_Id(1);
        it.setItem1("Phone");
        it.setItem2("clothes");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaorm");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try {

            transaction.begin();
            manager.persist(it);
            transaction.commit();


        }catch (Exception e){
            transaction.rollback();
        }


    }


    }

