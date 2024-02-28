package BusinessLogic.BL;

import java.util.List;

import DataAccess.DAO.HormigaDAO;

import DataAccess.DTO.HormigaDTO;
import DataAccess.DTO.HormigaDTO;

public class HormigaBL {
   private HormigaDTO Hormiga;
   private static HormigaDAO hDAO = new HormigaDAO();

   public HormigaBL() {
   }

   public List<HormigaDTO> getAll() throws Exception {
      return hDAO.readAll();
   }

   public static HormigaDTO getHormigaRol(Integer idHormiga) throws Exception {
      return hDAO.obtenerHormigaRol(idHormiga);
   }

   public HormigaDTO getBy(int IdHormiga) throws Exception {
      Hormiga = hDAO.readBy(IdHormiga);
      return Hormiga;
   }

   public boolean add(String Nombre) throws Exception {
      Hormiga = new HormigaDTO();
      Hormiga.setNombre(Nombre);
      return hDAO.create(Hormiga);
   }

   public boolean update(int idHormiga, String Nombre) throws Exception {
      Hormiga = new HormigaDTO();
      Hormiga.setIdHormiga(idHormiga);
      Hormiga.setNombre(Nombre);
      return hDAO.update(Hormiga);
   }

   public boolean delete(int idHormiga) throws Exception {
      return hDAO.delete(idHormiga);
   }
}