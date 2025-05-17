READ ME: 

--- [Khusus untuk folder TugasPraktikum6] ---

Fitur tambahan yang ditambahkan dalam program ini adalah filterByPrice(double min, double max), yang berfungsi untuk menampilkan daftar produk dengan harga dalam rentang tertentu. Fitur ini memanfaatkan List<Product<?>> dari koleksi produk utama dan melakukan pengecekan harga setiap produk menggunakan perulangan. Dengan memanfaatkan konsep generic dan collection, fitur ini menambah fleksibilitas pencarian produk berdasarkan kriteria harga yang ada.

--- [Khusus untuk folder TugasPraktikum7] ---

Program ini adalah aplikasi sederhana yang menampilkan daftar film ala ala sistem pemesanan tiket bioskop, dengan film disimpan dalam array dan pengguna diminta memilih film dengan memasukkan angka indeks. sebelum menampilkan film, program memeriksa apakah input berada dalam rentang valid, dan jika tidak, melempar exception secara manual menggunakan throw new IllegalArgumentException, yang kemudian ditangani dalam blok try catch agar program tidak crash dan pengguna menerima pesan kesalahan yang jelas, sehingga program dapat dijalankan kembali lebih aman dan memberikan pengalaman pengguna yang lebih baik.

