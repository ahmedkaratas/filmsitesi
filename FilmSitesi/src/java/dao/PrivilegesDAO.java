package dao;

import entity.Privileges;
import entity.SystemGroup;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PrivilegesDAO extends DBConnection {

    private GroupDAO sdao;

    public void createPrivileges(Privileges g) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "insert into privilege (sgroup,mname,icreate,iupdate,idelete,ilist,ishow,iread) values ('" + g.getPgroup().getId() + "','" + g.getMname() + "','" + g.isIcreate() + "','" + g.isIupdate() + "','" + g.isIdelete() + "','" + g.isIlist() + "','" + g.isIshow() + "','" + g.isIread() + "')";
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deletePrivileges(Privileges g) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "delete from privilege where id =" + g.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updatePrivileges(Privileges g) {
        try {

            Statement st = this.getConnection().createStatement();
            String q = "update privilege set mname ='" + g.getMname() + "',ugroup='" + g.getPgroup().getId() + "' where id =" + g.getId();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Privileges> getPrivilegesList(int page, int pageSize) {
        List<Privileges> PrivilegesList = new ArrayList<>();

        int start = (page - 1) * pageSize;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select * from privilege order by id asc limit '" + pageSize + "' offset '" + start + "'";;
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                SystemGroup g = this.getSdao().getByID(rs.getInt("sgroup"));
                PrivilegesList.add(new Privileges(rs.getInt("id"), g, rs.getString("mname"), rs.getBoolean("icreate"), rs.getBoolean("iupdate"), rs.getBoolean("idelete"), rs.getBoolean("ilist"), rs.getBoolean("ishow"), rs.getBoolean("iread")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return PrivilegesList;

    }

    public Privileges getGroupPrivileges(SystemGroup sg, String module) {
        Privileges priv = null;
        try {

            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from privilege where sgroup=" + sg.getId() + "and mname='" + module + "'");
            rs.next();
            SystemGroup g = this.getSdao().getByID(rs.getInt("sgroup"));
            priv = new Privileges(rs.getInt("id"), g, rs.getString("mname"), rs.getBoolean("icreate"), rs.getBoolean("iupdate"), rs.getBoolean("idelete"), rs.getBoolean("ilist"), rs.getBoolean("ishow"), rs.getBoolean("iread"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return priv;
    }

    public int count() {
        int count = 0;

        try {

            Statement st = this.getConnection().createStatement();
            String q = "select count(id) as id_count from privilege";
            ResultSet rs = st.executeQuery(q);
            rs.next();
            count = rs.getInt("id_count");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

    public GroupDAO getSdao() {
        if (this.sdao == null) {
            this.sdao = new GroupDAO();
        }
        return sdao;
    }

    public void setSdao(GroupDAO sdao) {
        this.sdao = sdao;
    }

}
