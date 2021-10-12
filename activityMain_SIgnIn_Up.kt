class SignInUpAct : AppCompatActivity() {
    lateinit var binding: ActivitySignUpInBinding
    private var signState = "empty"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        signState = intent.getStringExtra(Constance.SIGN_STATE)!!
        if (signState == Constance.SIGN_IN_STATE) {
            binding.editTextTextPersonName3.visibility = View.GONE
            binding.editTextTextPersonName4.visibility = View.GONE
            binding.editTextTextPersonName5.visibility = View.GONE
            binding.button2.visibility = View.INVISIBLE
        }
    }
        fun onClickDone(view: View) {
            if (signState == Constance.SIGN_UP_STATE) {
                val intent = Intent()
                intent.putExtra(Constance.LOGIN, binding.edLogin.text.toString())
                intent.putExtra(Constance.PASSWORD, binding.edPassword.text.toString())
                intent.putExtra(Constance.NAME, binding.editTextTextPersonName3.text.toString())
                intent.putExtra(Constance.NAME2, binding.editTextTextPersonName4.text.toString())
                intent.putExtra(Constance.NAME3, binding.editTextTextPersonName5.text.toString())
                if(binding.imageView.isVisible)intent.putExtra(Constance.AVATAR_ID, R.drawable.director)
                setResult(RESULT_OK, intent)
                finish()
            } else if(signState == Constance.SIGN_IN_STATE) {
                intent.putExtra(Constance.LOGIN, binding.edLogin.text.toString())
                intent.putExtra(Constance.PASSWORD, binding.edPassword.text.toString())
                setResult(RESULT_OK, intent)
                finish()
            }

        }
        fun onClickAvatar(view: View){
            binding.imageView.visibility = View.VISIBLE
        }

    }



/*val intent = Intent()
intent.putExtra("key", "BAZARA NET")
setResult(RESULT_OK, intent)
finish()*/



class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImageID: Int = 0
    private var launcher: ActivityResultLauncher<Intent>? = null

    override fun onCreate(kek: Bundle?) {
        super.onCreate(kek)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                val text = result.data?.getStringExtra("key")
            }
        }


    }

    fun onClickSignIn (view: View) {
        val intent = Intent(this,SignInUpAct::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
        launcher?.launch(intent)
    }

    fun onClickSignUp (view: View){
        val intent = Intent(this,SignInUpAct::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
        launcher?.launch(intent)
    }

}
