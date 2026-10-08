# LAPORAN MINI PROJECT 3 

## PEMOGRAMAN BERORIENTASI OBJEK

### SISTEM MANAJEMEN PENITIPAN HEWAN 

Nama : Zahra Maysita

NIM : 2509116015

Kelas : A'2025

# BAB I 
# PENDAHULUAN
## 1.1 Deskripsi Program

Sistem Penitipan Hewan merupakan program berbasis Java yang dibuat untuk membantu mengelola data hewan dan data penitipan hewan. Program ini memiliki beberapa fitur seperti menambah, menampilkan, mengubah, menghapus, dan mencari data hewan, serta mengelola data penitipan hewan yang tersimpan dalam sistem.

Program ini dibuat dengan menerapkan konsep Object Oriented Programming (OOP), yaitu dengan membagi program ke dalam beberapa class sesuai dengan fungsinya. Class Hewan digunakan sebagai superclass untuk menyimpan data hewan, sedangkan class Kucing, Anjing, Kelinci, dan Hamster digunakan sebagai subclass yang mewarisi atribut dan method dari class Hewan. Selain itu, class Penitipan digunakan untuk menyimpan data penitipan, sedangkan class Service digunakan untuk mengatur pengolahan data. Program juga menggunakan object, constructor, ArrayList, percabangan, dan perulangan dalam proses pengelolaan data.

Program ini menerapkan encapsulation, inheritance, polymorphism, dan abstraction. Polymorphism diterapkan melalui method overriding pada method getInfo() dan method overloading pada method infoPenitipan(). Abstraction diterapkan dengan menggunakan abstract class dan abstract method pada class Hewan. Program juga menggunakan struktur MVC (Model, View, Controller) untuk memisahkan pengelolaan data, proses program, dan tampilan. Selain itu, program menerapkan interface InfoHewan sebagai nilai tambah. Program juga menerapkan validasi input untuk memastikan data yang dimasukkan sesuai dengan ketentuan yang telah ditetapkan. Dengan adanya penerapan konsep OOP, MVC, dan validasi input, program menjadi lebih terstruktur, mudah dikembangkan, serta dapat mengurangi kesalahan dalam pengolahan data.


## 1.2 Tujuan Program

Tujuan dari pembuatan program Sistem Penitipan Hewan yaitu:

1. Membantu pengelola penitipan hewan dalam mencatat dan mengelola data hewan yang dititipkan.
2. Memudahkan pengelola dalam menyimpan dan melihat informasi mengenai hewan dan data penitipannya.
3. Memudahkan pengelola dalam melakukan penambahan, perubahan, penghapusan, dan pencarian data.
4. Membantu menjaga data penitipan agar lebih teratur dan mudah dikelola.
5. Mengurangi kesalahan dalam memasukkan data dengan adanya validasi input.

## 1.3 Alur Singkat Program

Saat program dijalankan, sistem akan menampilkan menu utama yang berisi berbagai pilihan fitur. Pengguna dapat memilih menu sesuai kebutuhan, seperti mengelola data hewan maupun data penitipan hewan.
Pada pengelolaan data hewan, pengguna dapat menambahkan, menampilkan, mengubah, menghapus, dan mencari data hewan yang tersimpan di dalam sistem. Selain itu, pengguna juga dapat mengelola data penitipan hewan dengan menambahkan, menampilkan, mengubah, dan menghapus data penitipan.

Setiap data yang dimasukkan akan disimpan ke dalam sistem dan dapat diakses kembali melalui menu yang tersedia. Setelah suatu proses selesai dilakukan, sistem akan kembali menampilkan menu utama sehingga pengguna dapat memilih fitur lainnya.
Program akan terus berjalan sampai pengguna memilih menu Keluar. Setelah menu tersebut dipilih, sistem akan menampilkan pesan penutup dan program akan berhenti dijalankan.

## 1.4 Penjelasan Struktur Package

Program menggunakan beberapa package untuk mengelompokkan class berdasarkan fungsinya agar struktur program lebih rapi dan mudah dikelola.

Main

Berisi class SistemPenitipanHewanPeliharaan yang digunakan sebagai class utama untuk menjalankan program.

Model

Berisi class Hewan, Kucing, Anjing, Kelinci, Hamster, Penitipan, dan Service yang digunakan untuk mengelola data dan objek dalam program.

View

Berisi class HewanView yang hanya bertugas menampilkan menu, input, dan output kepada pengguna.

Controller

Berisi class HewanController yang bertugas menerima input pengguna dan menjalankan logic program, termasuk proses CRUD data hewan dan data penitipan.

Interfaces

Berisi interface InfoHewan yang digunakan sebagai penerapan nilai tambah berupa interface.

<img width="440" height="410" alt="image" src="https://github.com/user-attachments/assets/261c5e6c-aeb6-4b98-97fc-16c0487b7830" />


# BAB II 
# IMPLEMENTASI PROGRAM

Pada bab ini akan dijelaskan implementasi program Sistem Penitipan Hewan. Pembahasan meliputi menu-menu yang tersedia pada program, seperti pengelolaan data hewan, pengelolaan data penitipan, pencarian data, serta proses validasi input yang diterapkan dalam sistem. Penjelasan disertai dengan tampilan program untuk menunjukkan cara kerja setiap fitur yang tersedia.

## 2.1 Menu Utama

<img width="407" height="252" alt="image" src="https://github.com/user-attachments/assets/c7389c97-448a-4c5b-a789-70311974daab" />

Gambar di atas menampilkan menu utama dari program Sistem Manajemen Penitipan Hewan. Pada menu ini terdapat 10 pilihan, yaitu menu tambah data hewan, tambah data penitipan, tampilkan data hewan, tampilkan data penitipan, ubah data hewan, ubah data penitipan, hapus data hewan, hapus data penitipan, cari data hewan, dan keluar dari program. Pengguna dapat memilih menu dengan menginput angka yang tersedia sehingga sistem dapat menampilkan pesan kesalahan apabila pengguna memasukkan pilihan yang tidak valid.


<img width="865" height="396" alt="image" src="https://github.com/user-attachments/assets/6b547f25-c0d6-47f3-8b3a-89148944b6ff" />

Pada menu utama, program menggunakan struktur percabangan switch-case untuk memproses pilihan yang dimasukkan oleh pengguna. Setiap pilihan menu memiliki case yang berbeda sehingga sistem dapat menjalankan fitur sesuai dengan pilihan pengguna, seperti menambah, menampilkan, mengubah, menghapus, dan mencari data. Selain itu, program juga menggunakan default pada switch-case untuk menangani pilihan yang tidak tersedia.


<img width="185" height="52" alt="image" src="https://github.com/user-attachments/assets/e0ad3526-e348-472b-b1bb-58f06d72a08a" />

Apabila pengguna memasukkan angka di luar pilihan menu yang disediakan, sistem akan menampilkan pesan bahwa pilihan menu tidak valid dan meminta pengguna untuk memasukkan pilihan yang benar.


<img width="260" height="55" alt="image" src="https://github.com/user-attachments/assets/16b5d2ad-312a-454a-98fa-4704ce578330" />

Program juga menerapkan validasi input pada menu utama sehingga pengguna hanya dapat memasukkan angka sebagai pilihan menu. Jika pengguna memasukkan huruf atau karakter selain angka, sistem akan menampilkan pesan kesalahan dan meminta pengguna untuk menginput kembali pilihan yang valid. Dengan adanya validasi tersebut, program dapat berjalan dengan lebih aman dan mengurangi kesalahan input dari pengguna.

## 2.2 Kelola Data Hewan

### 2.2.1 Tampilkan Data Hewan

<img width="280" height="131" alt="image" src="https://github.com/user-attachments/assets/cba7247b-7135-4c1b-8032-eac071653411" />


<img width="542" height="160" alt="image" src="https://github.com/user-attachments/assets/db4e200b-5820-4fee-9b95-2274e1276612" />

Gambar di atas menampilkan data hewan yang tersimpan di dalam sistem. Data yang ditampilkan merupakan dummy data yang telah ditambahkan sebelumnya ke dalam ArrayList sebagai data awal program. Penerapan dummy data ini dilakukan untuk memenuhi ketentuan program, yaitu agar fitur read dapat langsung menampilkan data tanpa pengguna harus melakukan input data terlebih dahulu. Informasi yang ditampilkan meliputi ID hewan, nama hewan, dan jenis hewan. Selain menampilkan dummy data, menu ini juga dapat menampilkan data baru yang berhasil ditambahkan oleh pengguna melalui menu tambah data hewan.

<img width="336" height="615" alt="image" src="https://github.com/user-attachments/assets/b947b180-d0dc-4687-9a28-bc79a184eeb8" />

Gambar di atas menampilkan data yang sudah ditambahkan dan tersimpan di dalam sistem. Pada menu tampilkan data hewan, informasi yang ditampilkan berupa ID hewan, nama hewan, jenis hewan dan ras hewan.

### 2.2.2 Tambah Data Hewan

<img width="262" height="81" alt="image" src="https://github.com/user-attachments/assets/35e58391-805e-4d77-a2aa-9b3e66356fe7" />

<img width="222" height="80" alt="image" src="https://github.com/user-attachments/assets/7c485bc2-60ee-42fe-a2d4-2b994fb8b3a3" />

<img width="205" height="60" alt="image" src="https://github.com/user-attachments/assets/9cf5133f-c8f9-4b3a-a007-93e8807aaaff" />

<img width="276" height="67" alt="image" src="https://github.com/user-attachments/assets/72dbc376-ae06-4aa4-b957-8a98748e73cd" />

Program juga menerapkan validasi input pada proses penambahan data hewan. ID hewan harus berupa angka, tidak boleh bernilai nol atau negatif, serta tidak boleh menggunakan ID yang sudah terdaftar sebelumnya.

<img width="312" height="95" alt="image" src="https://github.com/user-attachments/assets/89e17f0e-964a-4a94-9a12-3cbdf295d8c3" />

<img width="342" height="232" alt="image" src="https://github.com/user-attachments/assets/f31b667c-7586-4ec6-bcd7-3e537db180b0" />

<img width="342" height="156" alt="image" src="https://github.com/user-attachments/assets/eddbea85-9ecf-4f5e-85de-bcf7c471e697" />

<img width="292" height="162" alt="image" src="https://github.com/user-attachments/assets/0980f1a9-67c9-4010-9cc6-4aea81ac5c29" />

Selain itu, nama hewan tidak boleh kosong. Jika terdapat data yang tidak sesuai, sistem akan menampilkan pesan kesalahan dan data tidak akan disimpan ke dalam sistem.
Pada saat memilih jenis hewan, pengguna hanya dapat memasukkan angka sesuai pilihan yang tersedia, yaitu 1 untuk Kucing, 2 untuk Anjing, 3 untuk Kelinci, dan 4 untuk Hamster. Apabila pengguna memasukkan angka di luar pilihan tersebut atau memasukkan huruf maupun karakter selain angka, sistem akan menampilkan pesan kesalahan dan meminta pengguna untuk memasukkan pilihan yang valid.


<img width="292" height="251" alt="image" src="https://github.com/user-attachments/assets/b39dfc01-010e-4a0e-aede-b3119dfb9bf1" />

Gambar di atas menampilkan proses penambahan data hewan ke dalam sistem. Pengguna memasukkan ID hewan, nama hewan, dan memilih jenis hewan yang tersedia. Karena data yang dimasukkan valid, sistem berhasil menyimpan data hewan dan menampilkan pesan bahwa data berhasil ditambahkan.
### 2.2.3 Update Data Hewan


Gambar di atas menampilkan proses pembaruan data hewan yang tersimpan di dalam sistem. Pada menu ini, pengguna diminta memasukkan ID hewan yang ingin diubah. Jika ID hewan ditemukan, pengguna dapat memasukkan nama hewan yang baru dan sistem akan memperbarui data tersebut. Setelah proses berhasil dilakukan, sistem akan menampilkan pesan bahwa data hewan berhasil diperbarui.

<img width="220" height="70" alt="image" src="https://github.com/user-attachments/assets/75b363c8-994b-41ee-bcf0-223f275547bb" />

Apabila ID hewan yang dimasukkan tidak ditemukan, sistem akan menampilkan pesan bahwa data hewan tidak ditemukan sehingga proses pembaruan tidak dapat dilakukan.

<img width="282" height="90" alt="image" src="https://github.com/user-attachments/assets/6070e02f-4fd7-4682-a3de-1c1ada217fbd" />

selain itu nama hewan yang baru juga tidak boleh kosong. Jika pengguna tidak memasukkan nama hewan, sistem akan menampilkan pesan kesalahan dan data tidak akan diperbarui.

<img width="307" height="95" alt="image" src="https://github.com/user-attachments/assets/60700009-6e2a-42e4-9419-5b902b18da93" />

<img width="235" height="112" alt="image" src="https://github.com/user-attachments/assets/e17d0629-4835-4f77-97b1-7ab43e1a5cf0" />

dapat dilihat pada gambar diatas proses mengupdate data hewan telah berhasil dilakukan.

Menu ini digunakan ketika terdapat informasi hewan yang perlu diperbarui, seperti kesalahan atau perubahan nama hewan.
### 2.2.4 Hapus Data Hewan

<img width="225" height="72" alt="image" src="https://github.com/user-attachments/assets/3c8bdf66-376f-4ea6-9f75-2a4e8bd2f791" />

Gambar di atas menampilkan proses penghapusan data hewan yang tersimpan di dalam sistem. Menu ini digunakan ketika data hewan sudah tidak diperlukan atau terdapat data yang ingin dihapus dari sistem. Pada proses ini, pengguna diminta memasukkan ID hewan yang akan dihapus. Jika ID hewan ditemukan, sistem akan menghapus data tersebut dari daftar hewan dan menampilkan pesan bahwa data berhasil dihapus.

<img width="280" height="425" alt="image" src="https://github.com/user-attachments/assets/3dd6890d-3263-4f4b-98b1-4c71ba621cf8" />

dapat dilihat pada gambar diatas bahwa hewan dengan id 2 sudah tidak terdapat di dalam sistem

<img width="232" height="70" alt="image" src="https://github.com/user-attachments/assets/bd6c4b25-3140-49b9-aa26-bddfba4728dd" />

Apabila ID hewan yang dimasukkan tidak ditemukan, sistem akan menampilkan pesan bahwa data hewan tidak ditemukan sehingga proses penghapusan tidak dapat dilakukan.

### 2.2.5 Cari Data Hewan

<img width="290" height="152" alt="image" src="https://github.com/user-attachments/assets/0387b6d8-1e87-4ba3-9794-0b7e09706515" />

Gambar di atas menampilkan proses pencarian data hewan yang tersimpan di dalam sistem. Menu ini digunakan untuk memudahkan pengguna dalam menemukan data hewan tertentu tanpa harus melihat seluruh data yang tersedia. Pada proses ini, pengguna diminta memasukkan ID hewan yang ingin dicari. Jika ID hewan ditemukan, sistem akan menampilkan informasi hewan yang sesuai dengan data yang tersimpan.

<img width="320" height="71" alt="image" src="https://github.com/user-attachments/assets/caec3666-d62b-4713-be60-a2cb5770f667" />

Apabila ID hewan yang dimasukkan tidak ditemukan, sistem akan menampilkan pesan bahwa data hewan tidak ditemukan.

<img width="322" height="75" alt="image" src="https://github.com/user-attachments/assets/a495f284-729b-42c4-bd53-9fa42c3570b8" />
Program juga menerapkan validasi input sehingga ID hewan harus berupa angka. Jika pengguna memasukkan huruf atau karakter selain angka, sistem akan menampilkan pesan kesalahan dan proses pencarian tidak dapat dilakukan.

## 2.3 Kelola Data Penitipan

### 2.3.1 Tambah Data Penitipan

<img width="357" height="131" alt="image" src="https://github.com/user-attachments/assets/51b1f0f4-cb23-4d09-9b25-978f39d5d2a6" />

Gambar di atas menampilkan proses penambahan data penitipan ke dalam sistem. Pada menu ini, pengguna diminta memasukkan ID penitipan, ID hewan, tanggal masuk, dan lama penitipan. Setelah seluruh data dimasukkan dengan benar, sistem akan menyimpan data penitipan dan menampilkan pesan bahwa data berhasil ditambahkan.

<img width="292" height="97" alt="image" src="https://github.com/user-attachments/assets/1b0c8fa6-7505-4bea-970d-cb0f2f8bc11e" />

<img width="282" height="86" alt="image" src="https://github.com/user-attachments/assets/f75fd30b-6097-44ab-9e15-7e74e4579408" />

<img width="331" height="72" alt="image" src="https://github.com/user-attachments/assets/6e73574d-4f1a-416b-acb8-da7abb544b81" />

<img width="232" height="95" alt="image" src="https://github.com/user-attachments/assets/9a8c6189-276d-40ea-8ede-6fc200824676" />

<img width="320" height="110" alt="image" src="https://github.com/user-attachments/assets/fc22bfda-e6a6-49ce-83d8-16123d4aa80f" />

<img width="332" height="130" alt="image" src="https://github.com/user-attachments/assets/25da5f36-8ae6-431a-b6ab-8252ddca3b94" />

Program juga menerapkan validasi input pada proses penambahan data penitipan. ID penitipan, ID hewan, dan lama penitipan harus berupa angka serta tidak boleh bernilai nol atau negatif. Selain itu, tanggal masuk tidak boleh kosong. Apabila pengguna memasukkan data yang tidak sesuai, seperti huruf pada kolom angka atau nilai yang tidak valid, sistem akan menampilkan pesan kesalahan dan data tidak akan disimpan.

### 2.3.2 Tampilkan Data Penitipan

<img width="392" height="337" alt="image" src="https://github.com/user-attachments/assets/18fc98cf-e989-4d7a-8ad5-c3926082a8ed" />

Gambar di atas menampilkan data penitipan yang tersimpan di dalam sistem. Informasi yang ditampilkan meliputi ID penitipan, ID hewan, tanggal masuk, dan lama penitipan. Menu ini digunakan untuk melihat seluruh data penitipan yang tersedia sehingga pengguna dapat mengetahui informasi penitipan yang telah tersimpan.

### 2.3.3 Update Data Penitipan 

<img width="402" height="555" alt="image" src="https://github.com/user-attachments/assets/b93d1459-d5ae-4795-aff2-36aa6495ef42" />

Gambar di atas menampilkan proses pembaruan data penitipan yang tersimpan di dalam sistem. Menu ini digunakan ketika terdapat informasi penitipan yang perlu diperbarui, seperti perubahan tanggal masuk atau lama penitipan. Pada proses ini, pengguna diminta memasukkan ID penitipan yang ingin diubah. Jika ID penitipan ditemukan, pengguna dapat memasukkan tanggal masuk dan lama penitipan yang baru. Setelah proses berhasil dilakukan, sistem akan memperbarui data dan menampilkan pesan bahwa data penitipan berhasil diperbarui.

<img width="291" height="75" alt="image" src="https://github.com/user-attachments/assets/635b2cf3-641d-463a-b7c3-96543242eb96" />

Apabila ID penitipan yang dimasukkan tidak ditemukan, sistem akan menampilkan pesan bahwa data penitipan tidak ditemukan sehingga proses pembaruan tidak dapat dilakukan.

### 2.3.4 Hapus Data Penitipan

<img width="461" height="522" alt="image" src="https://github.com/user-attachments/assets/1433deaa-419c-4337-92b0-b3208065f2ee" />

Gambar di atas menampilkan proses penghapusan data penitipan yang tersimpan di dalam sistem. Menu ini digunakan ketika data penitipan sudah tidak diperlukan atau terdapat data yang ingin dihapus dari sistem. Pada proses ini, pengguna diminta memasukkan ID penitipan yang akan dihapus. Jika ID penitipan ditemukan, sistem akan menghapus data tersebut dan menampilkan pesan bahwa data berhasil dihapus.


<img width="292" height="70" alt="image" src="https://github.com/user-attachments/assets/d7d2eb3b-d878-4488-8436-a46de0a313dd" />

Apabila ID penitipan yang dimasukkan tidak ditemukan, sistem akan menampilkan pesan bahwa data penitipan tidak ditemukan sehingga proses penghapusan tidak dapat dilakukan.

<img width="311" height="67" alt="image" src="https://github.com/user-attachments/assets/c07aef22-3e8c-44d4-b2e4-bdab7ee06c1b" />

Program juga menerapkan validasi input pada proses penghapusan data penitipan. ID penitipan harus berupa angka. Jika pengguna memasukkan huruf atau karakter selain angka, sistem akan menampilkan pesan kesalahan dan proses penghapusan tidak dapat dilakukan.

## 2.3 Menu Keluar

<img width="597" height="231" alt="image" src="https://github.com/user-attachments/assets/a34cbe2a-429f-4d25-81fe-44a6d0a99bd9" />

Gambar di atas menampilkan menu keluar dari program. Pada menu ini, pengguna dapat memilih pilihan Keluar untuk mengakhiri program. Setelah pilihan tersebut dipilih, sistem akan menampilkan pesan terima kasih dan program akan berhenti dijalankan.

# BAB III
# PENERAPAN KONSEP OOP
Pada bab ini akan dijelaskan penerapan konsep Object Oriented Programming (OOP) yang digunakan dalam program Sistem Penitipan Hewan. Konsep yang diterapkan meliputi encapsulation, inheritance, dan polymorphism sebagai nilai tambah dalam pengembangan program.

## 3.1 Encapsulation 

Encapsulation atau enkapsulasi merupakan konsep OOP yang digunakan untuk membungkus dan melindungi data agar tidak dapat diakses atau diubah secara langsung dari luar class. Tujuan utama dari encapsulation adalah mencegah data diubah sembarangan sehingga nilai yang tersimpan tetap valid dan lebih terkontrol. pada program Sistem Penitipan Hewan, encapsulation diterapkan dengan menggunakan access modifier private pada atribut class serta method getter dan setter untuk mengakses maupun mengubah data. Dengan cara ini, data tidak dapat diakses secara langsung dari luar class, melainkan harus melalui method yang telah disediakan.

<img width="295" height="61" alt="image" src="https://github.com/user-attachments/assets/be2d4634-e2e8-4316-9fd2-2df1ff6640c2" />


<img width="472" height="341" alt="image" src="https://github.com/user-attachments/assets/0a7d2856-8648-426f-b1dd-6b633070d158" />



Gambar di atas menunjukkan penerapan encapsulation pada class Hewan. Penerapan ini dapat dilihat dari penggunaan access modifier private pada atribut idHewan dan namaHewan. Dengan menggunakan private, atribut tersebut tidak dapat diakses secara langsung dari luar class. Untuk mengambil dan mengubah nilai atribut, digunakan method getter dan setter yang telah disediakan. Penerapan encapsulation ini bertujuan untuk melindungi data agar tidak diakses atau diubah secara sembarangan dari luar class.

## 3.2 Inheritance 

Inheritance atau pewarisan merupakan konsep OOP yang memungkinkan suatu class mewarisi atribut dan method dari class lain. Dengan adanya inheritance, kode dapat digunakan kembali sehingga program menjadi lebih terstruktur dan mengurangi penulisan kode yang berulang.

Pada program Sistem Penitipan Hewan, inheritance diterapkan pada class Kucing, Anjing, Kelinci, dan Hamster yang mewarisi class Hewan sebagai superclass. Dengan pewarisan tersebut, setiap subclass dapat menggunakan atribut dan method yang sudah dimiliki oleh class Hewan tanpa perlu menuliskannya kembali.

class anjing

<img width="405" height="52" alt="image" src="https://github.com/user-attachments/assets/9b07b5fd-d703-46e8-a32c-aab63643caee" />

class hamster

<img width="382" height="45" alt="image" src="https://github.com/user-attachments/assets/e64ce2a0-a131-4e9e-839a-5844498067a3" />

class kelinci

<img width="376" height="37" alt="image" src="https://github.com/user-attachments/assets/14540c4f-2450-43e5-a6f7-4b691a157b5a" />

class kucing

<img width="371" height="47" alt="image" src="https://github.com/user-attachments/assets/44704e5a-e404-45a5-8df3-fe9e57514c4f" />

## 3.3 Polymorphism 

### Method Overriding


Polymorphism merupakan konsep OOP yang memungkinkan method dengan nama yang sama memiliki perilaku atau fungsi yang berbeda. Pada program ini, polymorphism diterapkan menggunakan method overriding dan method overloading.


Method overriding diterapkan pada method getInfo() yang terdapat pada class Hewan. Method tersebut kemudian di-override pada class Kucing, Anjing, Kelinci, dan Hamster. Pada saat data hewan ditampilkan, program memanggil method getInfo() melalui objek h yang bertipe Hewan. Karena method getInfo() telah di-override pada masing-masing subclass, maka output yang ditampilkan akan menyesuaikan dengan jenis hewan yang diproses.


Letak overriding: class Kucing, Anjing, Kelinci, dan Hamster

class kucing

<img width="505" height="145" alt="image" src="https://github.com/user-attachments/assets/2ffad36e-4752-4864-8893-84db2eb8d898" />


class anjing 

<img width="431" height="92" alt="image" src="https://github.com/user-attachments/assets/933e5761-b3d9-4db3-8143-fc51937c767c" />


class kelinci 

<img width="440" height="86" alt="image" src="https://github.com/user-attachments/assets/ed3bd48a-35f2-421f-bf47-c1b712065212" />


class hamster

<img width="432" height="82" alt="image" src="https://github.com/user-attachments/assets/400bcb66-31bc-4a4d-8d09-a3417c24bee0" />


Pada gambar di bawah, method getInfo() berhasil dijalankan pada menu Tampilkan Data Hewan. Hal ini dapat dilihat dari output yang ditampilkan, di mana setiap jenis hewan menghasilkan informasi yang berbeda meskipun menggunakan method yang sama. Sebagai contoh, data kucing menampilkan informasi "Kucing - Milo", sedangkan data anjing menampilkan informasi "Anjing - Bruno". Dengan demikian, penerapan polymorphism melalui method overriding pada program ini telah berhasil dilakukan.

<img width="282" height="622" alt="image" src="https://github.com/user-attachments/assets/62a18ef8-9f9f-48f8-8d5d-f43575c4b691" />


### Method Overloading 

Method overloading diterapkan pada method infoPenitipan() di class Hewan. Terdapat dua method dengan nama yang sama, yaitu infoPenitipan() dan infoPenitipan(int lamaHari), tetapi memiliki parameter yang berbeda. Method infoPenitipan() digunakan untuk menampilkan nama hewan, sedangkan infoPenitipan(int lamaHari) digunakan untuk menampilkan lama penitipan hewan.

<img width="702" height="212" alt="image" src="https://github.com/user-attachments/assets/7759f0c8-d6a1-46ba-b820-7d0613d106a5" />


Jadi, pada program Sistem Penitipan Hewan ini polymorphism diterapkan dalam bentuk **overriding dan overloading**. Overriding digunakan pada method getInfo() yang dibuat berbeda pada setiap jenis hewan, seperti Kucing, Anjing, Kelinci, dan Hamster. Sedangkan overloading diterapkan pada method infoPenitipan() yang dibuat dalam dua bentuk dengan parameter yang berbeda. Dengan penerapan tersebut, program dapat menggunakan method yang sama untuk menghasilkan fungsi atau informasi yang sesuai dengan kebutuhan.


## 3.4  Abstraction

Abstraction diterapkan pada class Hewan dengan menggunakan abstract class dan abstract method. Class Hewan dibuat sebagai abstract class karena menjadi dasar untuk class Kucing, Anjing, Kelinci, dan Hamster. Selain itu, terdapat method getInfo() yang dibuat sebagai abstract method sehingga setiap class turunan harus membuat isi method tersebut sesuai dengan jenis hewannya.

### Absrtact class

Abstract class diterapkan pada class Hewan dengan menambahkan keyword abstract. Class Hewan digunakan sebagai class dasar yang akan diwarisi oleh class Kucing, Anjing, Kelinci, dan Hamster. Karena dibuat sebagai abstract class, class Hewan tidak digunakan untuk membuat objek secara langsung, tetapi menjadi dasar bagi class-class turunannya.


<img width="525" height="47" alt="image" src="https://github.com/user-attachments/assets/0bef39ba-c09b-47d3-b74d-28e3ea1c5b9a" />


### Abstract method

Abstract method diterapkan pada method getInfo() di class Hewan. Method ini dibuat tanpa isi atau implementasi karena isi dari getInfo() akan ditentukan oleh masing-masing class turunan. Class Kucing, Anjing, Kelinci, dan Hamster kemudian membuat kembali method getInfo() sesuai dengan informasi dari jenis hewan masing-masing.


<img width="397" height="51" alt="image" src="https://github.com/user-attachments/assets/0b56bd09-71f0-4a96-91ac-d861dee758c1" />


## 3.5 Interface (Nilai Tambah)


Nilai tambah yang diterapkan pada program ini adalah penggunaan interface InfoHewan. Interface tersebut digunakan untuk mendefinisikan method getInfo() yang nantinya digunakan pada class Hewan. Penerapannya dapat dilihat pada interface InfoHewan yang berada di package interfaces serta pada class Hewan yang menggunakan implements InfoHewan. Dengan adanya interface, struktur program menjadi lebih teratur dan mudah untuk dikembangkan.


<img width="302" height="127" alt="image" src="https://github.com/user-attachments/assets/26ea028b-c873-4aac-8e12-a094bbac1ca5" />


<img width="517" height="132" alt="image" src="https://github.com/user-attachments/assets/dd4a1979-99f2-4bfd-a7bc-1b725cf4eac3" />


