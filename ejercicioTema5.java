package com.ejercicioTema5;

public class ejercicioTema5 {

    public interface CocheCRUD {

        void guardar();

        void buscarTodos();

        void eliminar();

    }

    public static class CocheCRUDImpl implements CocheCRUD {
        @Override
        public void guardar() {
        }

        @Override
        public void buscarTodos() {
        }

        @Override
        public void eliminar() {
        }

        String save = "Guardando";
        String findAll = "Buscar todo";
        String delete = "Borrando";

        @Override
        public String toString() {
            return "CocheCRUDImpl" +
                    "save=" + save +
                    ", findAll=" + findAll +
                    ", delete=" + delete;
        }
    }

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();
        System.out.println(cocheCrud);
    }
}





