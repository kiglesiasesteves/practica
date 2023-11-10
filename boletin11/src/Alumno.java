public class Alumno {

    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float nota5;
    private float nota6;

    public Alumno() {
    }

    public Alumno(String nome, float nota1, float nota2, float nota3, float nota4, float nota5, float nota6) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.nota6 = nota6;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float getNota5() {
        return nota5;
    }

    public void setNota5(float nota5) {
        this.nota5 = nota5;
    }

    public float getNota6() {
        return nota6;
    }

    public void setNota6(float nota6) {
        this.nota6 = nota6;
    }
}
