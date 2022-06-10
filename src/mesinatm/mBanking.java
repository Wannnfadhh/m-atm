package mesinatm;

import javax.swing.JOptionPane;

public class mBanking {
    public static void main(String[] args) {
        mBanking menuuu = new mBanking();
        JOptionPane.showMessageDialog(null, "Selamat Datang di Aplikasi ATM BRI\nSilahkan Klik OK Untuk Melanjutkan");
        menuuu.cekpin();
        menuuu.menu();
    }
    
    void menu(){
        int pil=0;
        String menu =JOptionPane.showInputDialog("Pilih Menu Dibawah Ini: \n1.Info Saldo \n2.Transfer Saldo \n3.Tarik Saldo \n4.Exit");
        pil = Integer.parseInt(menu);
        switch(pil){
            case 1:
                infosaldo();
                menu();
            break;
            case 2:
                transfersaldo();
                menu();
            break;
            case 3:
                tariksaldo();
                menu();
            break;
            case 4:
                keluar();
            break;
            default:
            JOptionPane.showMessageDialog(null,"Mohonmaaf pilihan anda tidak ditemukan, Silahkan coba lagi.");
        }
    }
    void cekpin(){  
        int[] Pin = {51421603, 50421347, 50421605, 50421667, 50421725, 50421773, 51421000};

        String pinn = JOptionPane.showInputDialog("Masukkan Pin Rekening");
        int pin2 = Integer.parseInt(pinn);

        if (pin2 == Pin[0]){
            String cek2 = "Login Sukses!" ;
            JOptionPane.showMessageDialog(null, cek2);
        }else if (pin2 == Pin[1]){
            String cek2 = "Login Sukses!" ;
            JOptionPane.showMessageDialog(null, cek2);
        }else if (pin2 == Pin[2]){
            String cek2 = "Login Sukses!" ;
            JOptionPane.showMessageDialog(null, cek2);
        }else if (pin2 == Pin[3]){
            String cek2 = "Login Sukses!" ;
            JOptionPane.showMessageDialog(null, cek2);
        }else if (pin2 == Pin[4]){
            String cek2 = "Login Sukses!" ;
            JOptionPane.showMessageDialog(null, cek2);
        }else if (pin2 == Pin[5]){
            String cek2 = "Login Sukses!" ;
            JOptionPane.showMessageDialog(null, cek2);
        }else if (pin2 == Pin[6]){
            String cek2 = "Login Sukses!" ;
            JOptionPane.showMessageDialog(null, cek2);
        }else {
            String error2 = "Maaf pin yang anda masukkan salah";
            JOptionPane.showMessageDialog(null, error2);
            System.exit(0);
        }
    }
    void infosaldo(){
        int[] saldoo = {500000, 1000000, 1500000, 2000000, 2500000, 3000000, 3500000};
        
        int[] Pin = {51421603, 50421347, 50421605, 50421667, 50421725, 50421773, 51421000};

        String pinnn = JOptionPane.showInputDialog("Masukkan Pin Rekening");
        int cpin = Integer.parseInt(pinnn);

        if (cpin == Pin[0]){
            String inf = "Sisa saldo rekening anda senilai " + saldoo[0];
            JOptionPane.showMessageDialog(null, inf);
        }
        else if (cpin == Pin[1]){
            String inf = "Sisa saldo rekening anda senilai " + saldoo[1];
            JOptionPane.showMessageDialog(null, inf);
        }
        else if (cpin == Pin[2]){
            String inf = "Sisa saldo rekening anda senilai " + saldoo[2];
            JOptionPane.showMessageDialog(null, inf);
        }
        else if (cpin == Pin[3]){
            String inf = "Sisa saldo rekening anda senilai " + saldoo[3];
            JOptionPane.showMessageDialog(null, inf);
        }
        else if (cpin == Pin[4]){
            String inf = "Sisa saldo rekening anda senilai " + saldoo[4];
            JOptionPane.showMessageDialog(null, inf);
        }
        else if (cpin == Pin[5]){
            String inf = "Sisa saldo rekening anda senilai " + saldoo[5];
            JOptionPane.showMessageDialog(null, inf);
        }
        else if (cpin == Pin[6]){
            String inf = "Sisa saldo rekening anda senilai " + saldoo[6];
            JOptionPane.showMessageDialog(null, inf);
        }
        else {
        String errorr = "Maaf pin rekening yang anda masukkan salah, silahkan coba lagi";
        JOptionPane.showMessageDialog(null, errorr);
        System.exit(0);
        }
    }
    void transfersaldo(){
        int totalsaldo = 1000000;
        
        int[] Pin = {51421603, 50421347, 50421605, 50421667, 50421725, 50421773, 51421000};

        String pinn = JOptionPane.showInputDialog("Masukkan Pin Rekening");
        int pin2 = Integer.parseInt(pinn);

        if (pin2 == Pin[0]){
            JOptionPane.showInputDialog("Masukkan nomor rekening yang dituju");
            String saldo = JOptionPane.showInputDialog("Masukkan jumlah saldo yang ingin di transfer");
            int nilaisaldo = Integer.parseInt(saldo);
            if (nilaisaldo <= 1000000){
                int total = (totalsaldo - nilaisaldo);
                JOptionPane.showMessageDialog(null, "Mohon ditunggu \nTransfer sedang dalam proses");
                JOptionPane.showMessageDialog(null, "Anda telah berhasil melakukan transfer" + "\nSisa saldo rekening anda senilai Rp. " + total);
            }else {
                JOptionPane.showMessageDialog(null, "Maaf saldo anda tidak cukup, Silahkan coba lagi");
            }
        }else if (pin2 == Pin[1]){
            JOptionPane.showInputDialog("Masukkan nomor rekening yang dituju");
            String saldo = JOptionPane.showInputDialog("Masukkan jumlah saldo yang ingin di transfer");
            int nilaisaldo = Integer.parseInt(saldo);
            if (nilaisaldo <= 1000000){
                int total = (totalsaldo - nilaisaldo);
                JOptionPane.showMessageDialog(null, "Mohon ditunggu \nTransfer sedang dalam proses");
                JOptionPane.showMessageDialog(null, "Anda telah berhasil melakukan transfer" + "\nSisa saldo rekening anda senilai Rp. " + total);
            }else {
                JOptionPane.showMessageDialog(null, "Maaf saldo anda tidak cukup, Silahkan coba lagi");
            }
        }else if (pin2 == Pin[2]){
            JOptionPane.showInputDialog("Masukkan nomor rekening yang dituju");
            String saldo = JOptionPane.showInputDialog("Masukkan jumlah saldo yang ingin di transfer");
            int nilaisaldo = Integer.parseInt(saldo);
            if (nilaisaldo <= 1000000){
                int total = (totalsaldo - nilaisaldo);
                JOptionPane.showMessageDialog(null, "Mohon ditunggu \nTransfer sedang dalam proses");
                JOptionPane.showMessageDialog(null, "Anda telah berhasil melakukan transfer" + "\nSisa saldo rekening anda senilai Rp. " + total);
            }else {
                JOptionPane.showMessageDialog(null, "Maaf saldo anda tidak cukup, Silahkan coba lagi");
            }
        }else if (pin2 == Pin[3]){
            JOptionPane.showInputDialog("Masukkan nomor rekening yang dituju");
            String saldo = JOptionPane.showInputDialog("Masukkan jumlah saldo yang ingin di transfer");
            int nilaisaldo = Integer.parseInt(saldo);
            if (nilaisaldo <= 1000000){
                int total = (totalsaldo - nilaisaldo);
                JOptionPane.showMessageDialog(null, "Mohon ditunggu \nTransfer sedang dalam proses");
                JOptionPane.showMessageDialog(null, "Anda telah berhasil melakukan transfer" + "\nSisa saldo rekening anda senilai Rp. " + total);
            }else {
                JOptionPane.showMessageDialog(null, "Maaf saldo anda tidak cukup, Silahkan coba lagi");
            }
        }else if (pin2 == Pin[4]){
            JOptionPane.showInputDialog("Masukkan nomor rekening yang dituju");
            String saldo = JOptionPane.showInputDialog("Masukkan jumlah saldo yang ingin di transfer");
            int nilaisaldo = Integer.parseInt(saldo);
            if (nilaisaldo <= 1000000){
                int total = (totalsaldo - nilaisaldo);
                JOptionPane.showMessageDialog(null, "Mohon ditunggu \nTransfer sedang dalam proses");
                JOptionPane.showMessageDialog(null, "Anda telah berhasil melakukan transfer" + "\nSisa saldo rekening anda senilai Rp. " + total);
            }else {
                JOptionPane.showMessageDialog(null, "Maaf saldo anda tidak cukup, Silahkan coba lagi");
            }
        }else if (pin2 == Pin[5]){
            JOptionPane.showInputDialog("Masukkan nomor rekening yang dituju");
            String saldo = JOptionPane.showInputDialog("Masukkan jumlah saldo yang ingin di transfer");
            int nilaisaldo = Integer.parseInt(saldo);
            if (nilaisaldo <= 1000000){
                int total = (totalsaldo - nilaisaldo);
                JOptionPane.showMessageDialog(null, "Mohon ditunggu \nTransfer sedang dalam proses");
                JOptionPane.showMessageDialog(null, "Anda telah berhasil melakukan transfer" + "\nSisa saldo rekening anda senilai Rp. " + total);
            }else {
                JOptionPane.showMessageDialog(null, "Maaf saldo anda tidak cukup, Silahkan coba lagi");
            }
        }else if (pin2 == Pin[6]){
            JOptionPane.showInputDialog("Masukkan nomor rekening yang dituju");
            String saldo = JOptionPane.showInputDialog("Masukkan jumlah saldo yang ingin di transfer");
            int nilaisaldo = Integer.parseInt(saldo);
            if (nilaisaldo <= 1000000){
                int total = (totalsaldo - nilaisaldo);
                JOptionPane.showMessageDialog(null, "Mohon ditunggu \nTransfer sedang dalam proses");
                JOptionPane.showMessageDialog(null, "Anda telah berhasil melakukan transfer" + "\nSisa saldo rekening anda senilai Rp. " + total);
            }else {
                JOptionPane.showMessageDialog(null, "Maaf saldo anda tidak cukup, Silahkan coba lagi");
            }
        }else {
            String error2 = " Maaf pin yang anda masukkan salah ";
            JOptionPane.showMessageDialog(null, error2);
            System.exit(0);
        }
    }
    void tariksaldo() {
        int saldo = 1000000;
        int kon, hasil;
        int[] jml = {50000, 100000, 200000, 250000, 500000, 1000000}; 
        int[] Pin = {51421603, 50421347, 50421605, 50421667, 50421725, 50421773, 51421000};

        String tarik =JOptionPane.showInputDialog("Pilih nominal yang akan ditarik : \n1. 50.000 \n2. 100.000 \n3. 200.000 \n4. 250.000 \n5. 500.000 \n6. 1.000.000");
        kon = Integer.parseInt(tarik);

        switch (kon){
            case 1 :
            if (JOptionPane.showConfirmDialog(null, "Anda akan dipindahkan ke laman selanjutnya","Notice",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
                hasil = saldo - 50000;

                String nama = JOptionPane.showInputDialog("Masukkan Pin Rekening ");
                int nama1 = Integer.parseInt(nama);

                if (nama1 == Pin[0]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[0] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[1]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[0] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[2]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[0] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[3]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[0] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[4]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[0] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[5]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[0] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[6]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[0] + " \nSisa saldo anda senilai Rp " + hasil);
                }
            }
            break ;
            case 2 :
            if (JOptionPane.showConfirmDialog(null, "Anda akan dipindahkan ke laman selanjutnya","Notice",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
                hasil = saldo - 100000;

                String nama = JOptionPane.showInputDialog("Masukkan Pin Rekening ");
                int nama1 = Integer.parseInt(nama);

                if (nama1 == Pin[0]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[1] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[1]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[1] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[2]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[1] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[3]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[1] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[4]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[1] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[5]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[1] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[6]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[1] + " \nSisa saldo anda senilai Rp " + hasil);
                }
            }
            break ;
            case 3 :
            if (JOptionPane.showConfirmDialog(null, "Anda akan dipindahkan ke laman selanjutnya","Notice",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
                hasil = saldo - 200000;

                String nama = JOptionPane.showInputDialog("Masukkan Pin Rekening ");
                int nama1 = Integer.parseInt(nama);

                if (nama1 == Pin[0]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[2] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[1]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[2] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[2]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[2] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[3]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[2] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[4]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[2] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[5]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[2] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[6]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[2] + " \nSisa saldo anda senilai Rp " + hasil);
                }
            }
            break ;
            case 4 :
            if (JOptionPane.showConfirmDialog(null, "Anda akan dipindahkan ke laman selanjutnya","Notice",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
                hasil = saldo - 250000;

                String nama = JOptionPane.showInputDialog("Masukkan Pin Rekening ");
                int nama1 = Integer.parseInt(nama);

                if (nama1 == Pin[0]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[3] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[1]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[3] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[2]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[3] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[3]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[3] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[4]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[3] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[5]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[3] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[6]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[3] + " \nSisa saldo anda senilai Rp " + hasil);
                }
            }
            break ;
            case 5 :
            if (JOptionPane.showConfirmDialog(null, "Anda akan dipindahkan ke laman selanjutnya","Notice",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
                hasil = saldo - 500000;

                String nama = JOptionPane.showInputDialog("Masukkan Pin Rekening ");
                int nama1 = Integer.parseInt(nama);

                if (nama1 == Pin[0]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[4] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[1]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[4] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[2]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[4] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[3]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[4] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[4]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[4] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[5]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[4] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[6]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[4] + " \nSisa saldo anda senilai Rp " + hasil);
                }
            }
            break ;
            case 6 :
            if (JOptionPane.showConfirmDialog(null, "Anda akan dipindahkan ke laman selanjutnya","Notice",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
                hasil = saldo - 1000000;

                String nama = JOptionPane.showInputDialog("Masukkan Pin Rekening ");
                int nama1 = Integer.parseInt(nama);

                if (nama1 == Pin[0]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[5] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[1]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[5] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[2]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[5] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[3]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[5] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[4]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[5] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[5]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[5] + " \nSisa saldo anda senilai Rp " + hasil);
                }else if (nama1 == Pin[6]){
                    JOptionPane.showMessageDialog(null, "Mohon ditunggu \nUang anda sedang di proses");
                    JOptionPane.showMessageDialog(null, "Selamat anda telah berhasil menarik Uang sebesar Rp "+ jml[5] + " \nSisa saldo anda senilai Rp " + hasil);
                }
            }
            break ;
            default :
            JOptionPane.showMessageDialog(null, "Maaf Input Yang Anda Masukkan Tidak Tersedia");
        }
    }
    void keluar(){
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?","Pilihan",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
            menu();
        }
    }
}