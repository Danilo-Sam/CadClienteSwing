package br.com.dsampaio.domain;

import java.util.Objects;

/**
 * @author danilo.sampaio
 */

public class Cliente {

    private String nome;
    private Long cpf;
    private Long tel;
    private String end;
    private Integer numero;
    private String cidade;
    private String estado;

    public Cliente(String nome, String cpf, String tel, String end, String num, String cidade, String estado) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf.trim());
        this.tel = Long.valueOf(tel.trim());
        this.end = end;
        this.numero = Integer.valueOf(num.trim());
        this.cidade = cidade;
        this.estado = estado;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    /**
     * @return Long return the tel
     */
    public Long getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(Long tel) {
        this.tel = tel;
    }

    /**
     * @return String return the end
     */
    public String getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * @return Integer return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return String return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return String return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
            return false;
        Cliente cliente = (Cliente) obj;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome='" + nome + '\'' + ", cpf=" + cpf + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

}
