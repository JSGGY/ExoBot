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
import DataAccess.DTO.PersonaDTO;


public class PersonaDAO extends SQLiteDataHelper implements IDAO<PersonaDTO> {

    @Override
    public boolean create(PersonaDTO entity) throws Exception {
        String query = "INSERT INTO Persona (Nombre) VALUES (?)";
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
    public List<PersonaDTO> readAll() throws Exception {
        ArrayList<PersonaDTO> list = new ArrayList<>();
        String query = "SELECT IdPersona,IdPersonaTipo,Cedula,Nombre,Estado,FechaCrea FROM Persona WHERE Estado = 'A'";
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                PersonaDTO s = new PersonaDTO(rs.getInt(1),
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
    public PersonaDTO readBy(Integer id) throws Exception {
        PersonaDTO oS = new PersonaDTO();
        String query = "SELECT IdPersona,IdPersonaTipo,Cedula,Nombre,Estado,FechaCrea FROM Persona WHERE Estado = 'A'AND IdSPersona = "+ id.toString();
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                oS = new PersonaDTO(rs.getInt(1),
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
    public boolean update(PersonaDTO entity) throws Exception {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = "UPDATE Persona SET Nombre = ?,FechaModifica = ?,WHERE IdPersona = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, entity.getNombre());
            stmt.setString(2,date.format(now).toString());
            stmt.setInt(3, entity.getIdPersona());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = "UPDATE Persona SET Estado = ? WHERE IdPersona = ?";
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