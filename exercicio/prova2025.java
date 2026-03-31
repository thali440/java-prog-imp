 // letra a  União de dois vetores sem repetição
 public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = 0;

       
        for (int i = 0; i < tamA; i++) {
            if (!contem(u, tamU, a[i])) {
                u[tamU] = a[i];
                tamU++;
            }
        }

       
        for (int i = 0; i < tamB; i++) {
            if (!contem(u, tamU, b[i])) {
                u[tamU] = b[i];
                tamU++;
            }
        }

        return tamU;
    }
}


//b) Ordenação com Insertion Sort
    public static void ordenar(int[] v, int n) {
        for (int i = 1; i < n; i++) {
            int chave = v[i];
            int j = i - 1;

            j = deslocar(v, j, chave);

            v[j + 1] = chave;
        }
}

// c) Gerar vetor sem repetição (mantendo ordem)
    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
        int tamVSR = 0;

        for (int i = 0; i < tamV; i++) {
           
            if (!contem(vsr, tamVSR, v[i])) {
                vsr[tamVSR] = v[i];
                tamVSR++;
            }
        }

        return tamVSR;
    }
}

 // d) Rotacionar vetor
    public static void rotacionar(int[] v, int tam, int k) {
        if (tam == 0) return;

        
        k = k % tam;

        
        if (k < 0) {
            k = tam + k;
        }

        inverter(v, 0, k - 1);
        inverter(v, k, tam - 1);
        inverter(v, 0, tam - 1);
    }
}