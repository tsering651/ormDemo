import jakarta.persistence.*;

@Entity
public class Cart {

   private int card_Id;
   private String name;
   private String location;
   private String branch;

   public Cart(int card_Id, String name, String location, String branch){
       this.card_Id=card_Id;
       this.name=name;
       this.location=location;
       this.branch=branch;

   }
   public Cart(){

   }

    public int getCard_Id() {
        return card_Id;
    }

    public void setCard_Id(int card_Id) {
        this.card_Id = card_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getbranch() {
        return branch;
    }

    public void setbranch(String  branch) {
        this.branch = branch;
    }

    public static void main(String[] args) {



        Cart cd = new Cart();

        cd.setName("saneet");
        cd.setLocation("chandigarh");
        cd.setbranch("sbi");


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaorm");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try {

            transaction.begin();
            manager.persist(cd);
            transaction.commit();


        }catch (Exception e){
            transaction.rollback();
        }


    }
}

