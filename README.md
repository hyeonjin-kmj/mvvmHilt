com.example.mvvmhilt/
├── di/
│   └── AppModule.kt            // Hilt 제공자
│
├── model/
│   └── User.kt                 // 데이터 클래스
│
├── repository/
│   └── UserRepository.kt       // 싱글턴 객체 (Hilt 주입 대상)
│
├── viewmodel/
│   └── LoginViewModel.kt       // ViewModel (Hilt 주입 대상)
│
├── ui/
│   └── LoginScreen.kt          // Compose UI
│
└── MainActivity.kt             // 엔트리 포인트
