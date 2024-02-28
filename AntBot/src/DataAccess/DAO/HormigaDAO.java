package DataAccess.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import DataAccess.SQLiteDataHelper;
import DataAccess.DTO.HormigaDTO;


public class HormigaDAO extends SQLiteDataHelper implements IDAO<HormigaDTO> {

    @Override
    public boolean create(HormigaDTO entity) throws Exception {
        String query = "INSERT INTO Hormiga (Nombre) VALUES (?)";
        try {
            Connection conn = openConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, entity.getNombre());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<HormigaDTO> readAll() throws Exception {
        ArrayList<HormigaDTO> list = new ArrayList<>();
        String query = "SELECT IdHormiga,IdHormigaTipo,Codigo,Nombre,Estado,FechaCrea FROM Hormiga WHERE Estado = 'A'";
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                HormigaDTO s = new HormigaDTO(rs.getInt(1),
                                              rs.getInt(2),
                                              rs.getString(3),
                                              rs.getString(4), 
                                              rs.getString(5),
                                              rs.getString(6));
                list.add(s);
            }
        } catch (SQLException e) {
            throw e;
        }
        return list;      
    }

    @Override
    public HormigaDTO readBy(Integer id) throws Exception {
        HormigaDTO oS = new HormigaDTO();
        String query = "SELECT IdHormiga,IdHormigaTipo,Codigo,Nombre,Estado,FechaCrea FROM Hormiga WHERE Estado = 'A'AND IdHormiga = "+ id.toString();
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                oS = new HormigaDTO(rs.getInt(1),
                                    rs.getInt(2),
                                    rs.getString(3),
                                    rs.getString(4), 
                                    rs.getString(5),
                                    rs.getString(6));
            }
        } catch (SQLException e) {
            throw e;
        }
        return oS;
    }

    @Override
    public boolean update(HormigaDTO entity) throws Exception {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = "UPDATE Hormiga SET Nombre = ?,FechaModifica = ?,WHERE IdHormiga = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, entity.getNombre());
            stmt.setString(2,date.format(now).toString());
            stmt.setInt(3, entity.getIdHormiga());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = "UPDATE Hormiga SET Estado = ? WHERE IdHormiga = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "X");
            stmt.setInt(2,id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        } 
    }
    
    
}