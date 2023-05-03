public class Hill_Cipher {
    public static void main(String[] args){
        //message to be encrypted.
        String message = "ACT";

        //get the key
        String key = "GYBNQKURP";
        HillCipher(message, key);
    }

    public static void HillCipher(String message, String key){

        // Get the key matrix from the key string
        int[][] keyMatrix = new int[3][3];
        getKeyMatrix(key, keyMatrix);

        int[][] messageVector = new int[3][1];

        //generating vector for message
        for(int i = 0; i < 3; i++){
            messageVector[i][0] = (message.charAt(i)) % 65;
        }

        int[][] cipherMatrix = new int [3][1];

        /*
        the following vector generates the encrypted text form
        the encrypted vector.
        */
        encrypt(cipherMatrix, keyMatrix, messageVector);

        String CipherText = "";

        /*
        generates the encrypted text from the encrypted vector
        */
        for(int j = 0; j < 3; j++){
            CipherText += (char) (cipherMatrix[j][0]+ 65);
        }

        //finally print the ciphertext
        System.out.println("CipherText : " + CipherText);
    }

    public static void encrypt(int cipherMatrix[][], int keyMatrix[][], int messageVector[][]){
        int x;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 1; j++){
                cipherMatrix[i][j] = 0;
                for(x = 0; x < 3; x++){
                    cipherMatrix[i][j] += keyMatrix[i][x] * messageVector[x][j];
                }
                cipherMatrix[i][j] = cipherMatrix[i][j] % 26;
            }
        }
    }

    public static void getKeyMatrix(String key, int keyMatrix[][]){
        int k = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                keyMatrix[i][j] = (key.charAt(k)) % 65;
                k++;
            }
        }
    }
}
