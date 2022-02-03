

package br.com.gaudium.entrega.model;

import com.google.android.gms.maps.model.LatLng;

public class RepositoryImp implements  IRepository{
    public class Codebeautify {
        private String success;
        Response ResponseObject;


        // Getter Methods

        public String getSuccess() {
            return success;
        }

        public Response getResponse() {
            return ResponseObject;
        }

        // Setter Methods

        public void setSuccess(String success) {
            this.success = success;
        }

        public void setResponse(Response responseObject) {
            this.ResponseObject = responseObject;
        }
    }
    public class Response {
        private String nome;
        private String cargo;
        private String descricao;
        ArrayList < Object > historico = new ArrayList < Object > ();


        // Getter Methods

        public String getNome() {
            return nome;
        }

        public String getCargo() {
            return cargo;
        }

        public String getDescricao() {
            return descricao;
        }

        // Setter Methods

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }
}
