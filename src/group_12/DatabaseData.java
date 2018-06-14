package group_12;

import static group_12.DormitoryRentingSystem.my;
import java.sql.*;

public class DatabaseData {

    private Statement st;

    public DatabaseData(Statement st) {
        this.st = st;
    }

    public ResultSet getData(String str) {
        try {
            String query = "select * from DORMITORY_RENTING_SYSTEM." + str;
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public boolean udlog(String u, String s) throws
            SQLException {
        int i = st.executeUpdate("update DORMITORY_RENTING_SYSTEM.logins set pass = " + "'" + s + "'" + "where user_id = " + "'" + u + "'");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }

    

   

 

    public boolean insertAccountingData(String accounting_id, String income, String electronic_bil, String water_bill, String emp_pay, String main_tain, String benefit, String apartment_id) throws
            SQLException {
        int i = st.executeUpdate("Insert into DORMITORY_RENTING_SYSTEM.accounting values('" + accounting_id + "'," + income + "," + electronic_bil + "," + water_bill + "," + emp_pay + "," + main_tain + "," + benefit + ",'" + apartment_id +"')");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateAccountingData(String accounting_id, String income, String electronic_bil, String water_bill, String emp_pay, String main_tain, String benefit, String apartment_id) throws
            SQLException {
        System.out.println("UPDATE DORMITORY_RENTING_SYSTEM.accounting set acc_id="+"'"+accounting_id+"'"+",income="+income+",electronic_bill="+electronic_bil+",water_bill="+water_bill+",emp_pay="+emp_pay+",main_tain = "+main_tain+",benefit="+benefit +",apart_id ="+"'"+apartment_id +"'"+" where acc_id = " + "'"+accounting_id +"'");
        int i = st.executeUpdate("UPDATE DORMITORY_RENTING_SYSTEM.accounting set acc_id="+"'"+accounting_id+"'"+",income="+income+",electronic_bill="+electronic_bil+",water_bill="+water_bill+",emp_pay="+emp_pay+",main_tain = "+main_tain+",benefit="+benefit +",apart_id ="+"'"+apartment_id +"'"+" where acc_id = " + "'"+accounting_id +"'");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteAccountingData(String accounting_id) throws SQLException {
        boolean i = st.execute("DELETE FROM DORMITORY_RENTING_SYSTEM.accounting where acc_id = " + "'"+accounting_id+"'");
        return i;

    }


    public boolean insertPromotionData(String promotion_id, String start_date, String exp_date, String price, String detail) throws
            SQLException {
        int i = st.executeUpdate("Insert into DORMITORY_RENTING_SYSTEM.promotion values('" + promotion_id + 
                "',to_date('" + start_date + "','DDMMYY'),to_date('" + exp_date + "','DDMMYY')," + price + ",'" + detail + "')");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean insertEmployeeData(String employee_id, String name, String department, String apartment_id, String salary) throws
            SQLException {
        int j = st.executeUpdate("Insert into DORMITORY_RENTING_SYSTEM.employee_transitive values('" + department + "',"  + salary+ ")");
        int i = st.executeUpdate("Insert into DORMITORY_RENTING_SYSTEM.employee values('" + employee_id + "','" + name + "','" + department + "','" + apartment_id + "')");
        
        if (i > -1 && j>-1) {
            return true;
        } else {
            return false;
        }
        
    }

    public boolean insertApartmentData(String apart_id, String name, String phone, String address, String countfloor) throws
            SQLException {
        int i = st.executeUpdate("Insert into DORMITORY_RENTING_SYSTEM.apartment values('" + apart_id + "','" + name + "','" + phone + "','" + address + "'," + countfloor + ")");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }

    
//---UPDATE-----

   

    public boolean updateApartmentData(String apart_id, String name, String phone, String address, String countfloor) throws
            SQLException {
        int i = st.executeUpdate("UPDATE DORMITORY_RENTING_SYSTEM.apartment set apart_id = '" + apart_id + "',name = '" +
                name + "',phone = '" + phone +
                "',address = '" + address + "',count_floor = " + countfloor + " where apart_id = '" + apart_id + "'");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateEmployeeData(String employee_id, String name, String department, String apartment_id, String salary) throws
            SQLException {
         int j = st.executeUpdate("UPDATE DORMITORY_RENTING_SYSTEM.employee_transitive set department =  '" + department +  "',salary = " + salary + " where department = '" + department + "'");
        int i = st.executeUpdate("UPDATE DORMITORY_RENTING_SYSTEM.employee set emp_id = '" + employee_id + "',name = '" + name + "',department = '" + department + "',apart_id = '" + apartment_id + "'  where emp_id = '" + employee_id + "'");
        if (i > -1&& j>-1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updatePromotionData(String promotion_id, String start_date, String exp_date, String price, String detail) throws
            SQLException {
        int i = st.executeUpdate("UPDATE DORMITORY_RENTING_SYSTEM.promotion set pro_id = '" + promotion_id + "',start_date = to_date('"+ start_date + "','DDMMYY'),exp_date = to_date('"+ exp_date + "','DDMMYY'),price = " + price + ",detail = '" + detail + "' where pro_id = '" + promotion_id + "'");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }

    // ----DELETE---------
    
    public boolean deleteApartmentData(String apart_id) throws SQLException {
        boolean i = st.execute("DELETE FROM DORMITORY_RENTING_SYSTEM.apartment where apart_id = '" + apart_id + "'");
        return i;

    }

    public boolean deleteEmployeeData(String employee_id) throws SQLException {
        boolean i = st.execute("DELETE FROM DORMITORY_RENTING_SYSTEM.employee where emp_id = '" + employee_id + "'");
        return i;

    }

    public boolean deletePromotionData(String promotion_id) throws SQLException {
        boolean i = st.execute("DELETE FROM DORMITORY_RENTING_SYSTEM.promotion where pro_id = '" + promotion_id + "'");
        return i;

    }

 
    public boolean insertreceiptData(String rcp,String pro,String cus,String apart,String room,String contract,String free,String detail) throws
SQLException {
 int i = st.executeUpdate("insert into DORMITORY_RENTING_SYSTEM.receipt values('"+rcp+ "','"+pro+"','"+cus+"','"+apart+"','"+room+"','"+contract+"',"+free+",'"+detail+"')");
 if (i > -1) {return true;}
 else {return false;}
 }
   public boolean insertapartData(String promotion,String apartment,String id) throws
SQLException {
 int i = st.executeUpdate("insert into DORMITORY_RENTING_SYSTEM.apt_have_pro values('"+promotion+ "','"+apartment+"','"+id+"')");
 if (i > -1) {return true;}
 else {return false;}
 }
   public boolean insertroomsData(String room,String apart,String stat,String typ,String price_month,String price_dai) throws
SQLException {
    
 int i = st.executeUpdate("insert into DORMITORY_RENTING_SYSTEM.room values ('"+room+ "','"+apart+"','"+stat+"','"+typ+"')");
 if (i > -1) {return true;}
 else {return false;}
 }
public  boolean updateroomsData(String room,String apart,String stat,String typ,String price_month,String price_dai) throws
SQLException {
 int i = st.executeUpdate("update DORMITORY_RENTING_SYSTEM.room set room_number = "+
         "'"+room+"',apart_id = "+"'"+apart+"',"+"status ='"+stat+"',"+"types='"+typ+
         "'"+"where room_number = "+"'"+room+"'"
         );
 if (i > -1) { return true; }
else { return false; }
}
   
public  boolean updateapartData(String promotion, String apartment,String id) throws
SQLException {
 int i = st.executeUpdate("update DORMITORY_RENTING_SYSTEM.apt_have_pro set pro_id = "+"'"+promotion+"',apart_id = "+"'"+apartment+"'"+"where id = '"+id+"'");
 if (i > -1) { return true; }
else { return false; }
}
public  boolean updatereceiptData(String rcp,String pro,String cus,String apart,String room,String contract,String free,String details) throws
SQLException {
 int i = st.executeUpdate("update DORMITORY_RENTING_SYSTEM.receipt set receipt_id = "
         +"'"+rcp+"',pro_id= "+"'"+pro+"'"+",cus_id='"+cus+"'"+",apart_id='"
         +apart+"'"+",room_number='"+room+"'"+",contract_id='"+contract+"'"+",fee_total = "
         +free+",detail='"+details+"'"+"where receipt_id = "+"'"+rcp+"'");
 if (i > -1) { return true; }
else { return false; }
}

public  boolean deleteroomsData(String room,String apart,String stat,String typ,String price_month,String price_dai) throws
SQLException {
  boolean i  = st.execute("delete DORMITORY_RENTING_SYSTEM.room where room_number = "+"'"+room+"'");
          return i;
}
public  boolean deleteapartData(String id) throws
SQLException {
  boolean i  = st.execute("delete DORMITORY_RENTING_SYSTEM.apt_have_pro "+"where id = '"+id+"'");
   return i; 
}
 
public  boolean deletereceiptData(String rcp,String pro,String cus,String apart,String room,String contract,String free,String details) throws
SQLException {
  boolean i  = st.execute("delete DORMITORY_RENTING_SYSTEM.receipt where receipt_id = "
          +"'"+rcp+"'");
   return i; 
}
 

    public boolean insertBuy(String promotion_id, String customer_id, String apartment_id, String room_number, String contract_id, String receipt_id,String id) throws
            SQLException {
        int i = st.executeUpdate("insert into DORMITORY_RENTING_SYSTEM.buy values ('" + promotion_id + "','" + customer_id + "','" + apartment_id + "','" + room_number + "','" + contract_id + "','" + receipt_id + "','"+id+"')");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateBuy(String apromotion_id, String acustomer_id, String aapartment_id, String aroom_number, String acontract_id, String areceipt_id,String id) throws
            SQLException {
        int i = st.executeUpdate("update DORMITORY_RENTING_SYSTEM.buy set pro_id = " + "'" + apromotion_id + "'" + "," + "cus_id = " + "'" + acustomer_id + "'" + "," + "apart_id = " + "'" + aapartment_id + "'" + "," + "room_number = " + "'" + aroom_number + "'" + "," + "contract_id = " + "'" + acontract_id + "'" + "," + "receipt_id = " + "'" + areceipt_id + "'" + " WHERE id = " + "'" + id + "'");
            
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteBuy(String id) throws
            SQLException {
        boolean i = st.execute("DELETE FROM DORMITORY_RENTING_SYSTEM.buy WHERE id = " + "'" + id + "'" );
               
        return i;
    }
     
    // -----------contract-------------
    public boolean deleteContractData(String pro_id,String cus_id,String apart_id,String room_number,String contract_id,String r,String s) throws SQLException {
        
        boolean i = st.execute("DELETE FROM DORMITORY_RENTING_SYSTEM.Contract where contract_id = '"+contract_id+"'");
        boolean j = st.execute("DELETE FROM DORMITORY_RENTING_SYSTEM.CONTRACT_TRANSITIVE where START_DATE = to_date('"+s+"','ddmmyy')");
        return i||j;

    }
    
     public boolean insertContractData(String pro_id,String cus_id,String apart_id,String room_number,
             String contract_id,String start_date,String exp_date,String recipt_date,String deposite) throws
            SQLException {
        int j = st.executeUpdate("Insert into DORMITORY_RENTING_SYSTEM.CONTRACT_TRANSITIVE values(to_date('"
                +start_date+"','ddmmyy'),to_date('"+exp_date+"','ddmmyy'),"+deposite+")");
        int i = st.executeUpdate("Insert into DORMITORY_RENTING_SYSTEM.Contract values('"+
                pro_id+"','"+cus_id+"','"+apart_id+"','"+room_number+"','"+contract_id+"',to_date('"+start_date+"','ddmmyy'),"+recipt_date+")");
         
        if (i > -1 && j > -1) {
            return true;
        } else {
            return false;
        }
    }
     
     public boolean updateContractData(String pro_id,String cus_id,String apart_id,String room_number,String contract_id,String start_date,String exp_date,String recipt_date,String deposite) throws
            SQLException {
        int i = st.executeUpdate("UPDATE DORMITORY_RENTING_SYSTEM.Contract set pro_id = '" + pro_id + 
                "',cus_id = '" + cus_id + "',apart_id = '" + apart_id + 
                "',room_number = '" + room_number + "',contract_id = '" +
                contract_id +"',receipt_id = '"+recipt_date+"',start_date = to_date('"+
                start_date+"','ddmmyy') where  contract_id = '"+contract_id+"'");
               
            
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }
     public boolean insertcustomer(String acustomer_id,String  apersonal_id,String aname,String aaddress,String aphone) throws
            SQLException {
        int i = st.executeUpdate("insert into DORMITORY_RENTING_SYSTEM.customer values ('" + acustomer_id + "','" + apersonal_id + "','" + aname + "','" + aaddress + "','" + aphone + "')");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }
     public boolean updatecustomer(String acustomer_id,String  apersonal_id,String aname,String aaddress,String aphone) throws
            SQLException {
        int i = st.executeUpdate("update DORMITORY_RENTING_SYSTEM.customer set cus_id = " + "'" + acustomer_id + "'" + "," + "personal_id = " + "'" + apersonal_id + "'" + "," + "name = " + "'" + aname + "'" + "," + "phone = '" +aphone+"' WHERE cus_id = " + "'" + acustomer_id + "'");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }
     public boolean deletecustomer(String acustomer_id) throws
            SQLException {
        boolean i = st.execute("DELETE FROM DORMITORY_RENTING_SYSTEM.customer  WHERE cus_id = " + "'" + acustomer_id + "'");
        return i;
    }
      public boolean deleteroomwithscontractData(String pro_id,String cus_id,String room_number,String contract_id,String apart_id,String receipt_id,String id) throws SQLException {
        boolean i = st.execute("DELETE FROM DORMITORY_RENTING_SYSTEM.withs where id = '" + id + "'");
        return i;

    }
 
 public boolean insertroomwithscontractData(String pro_id,String cus_id,String room_number,String contract_id,String apart_id,String receipt_id,String id)  throws
            SQLException {
        int i = st.executeUpdate("Insert into DORMITORY_RENTING_SYSTEM.withs values('" + pro_id + "','"+cus_id+"','"+room_number+"','"+contract_id+"','"+apart_id+"','"+receipt_id+"','"+id+"')");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }
 
 public boolean updateroomwithscontractData(String pro_id,String cus_id,String room_number,String contract_id,String apart_id,String receipt_id,String id)  throws
            SQLException {
        int i = st.executeUpdate("UPDATE DORMITORY_RENTING_SYSTEM.withs set pro_id = '" + pro_id + 
                "',cus_id = '" + cus_id + "',room_number = '"
                +room_number+"',contract_id = '"+contract_id+"',apart_id = '" 
                + apart_id + "',receipt_id = '"+receipt_id+"' where id = '"+id+"'");
        if (i > -1) {
            return true;
        } else {
            return false;
        }
    }

}




