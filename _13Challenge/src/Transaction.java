
public class Transaction {
    private int id;
    private String desc;

    public Transaction(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDet(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Transaction [ID= " + id + ", Description= " + desc + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Transaction) {
            Transaction t = (Transaction) obj;
            //Two transaction instances are considered equal if their ids are same
            //NOTE: desc may match or may not match.
            if(this.id == t.id) {
                return true;
            }
        }
        return false;
    }
}
