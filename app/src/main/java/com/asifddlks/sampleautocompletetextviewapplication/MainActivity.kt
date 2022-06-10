package com.asifddlks.sampleautocompletetextviewapplication

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bankList = listOf<String>("AB Bank Limited",
            "Bangladesh Commerce Bank Limited",
            "Bank Asia Limited",
            "Bengal Commercial bank ltd",
            "BRAC Bank Limited",
            "Citizens Bank PLC",
            "City Bank Limited",
            "Community Bank Bangladesh Limited",
            "Dhaka Bank Limited",
            "Dutch-Bangla Bank Limited",
            "Eastern Bank Limited",
            "IFIC Bank Limited",
            "Jamuna Bank Limited",
            "Meghna Bank Limited",
            "Mercantile Bank Limited",
            "Midland Bank Limited",
            "Modhumoti Bank Limited",
            "Mutual Trust Bank Limited",
            "National Bank Limited",
            "National Credit & Commerce Bank Limited",
            "NRB Bank Limited",
            "NRB Commercial Bank Ltd",
            "One Bank Limited",
            "Padma Bank Limited",
            "Premier Bank Limited",
            "Prime Bank Limited",
            "Pubali Bank Limited",
            "Shimanto Bank Ltd",
            "Southeast Bank Limited",
            "South Bangla Agriculture and Commerce Bank Limited",
            "Trust Bank Limited",
            "United Commercial Bank Ltd",
            "Uttara Bank Limited",
            "Islami Shariah Based PCBs",
            "There are 10 Islami Shariah-based PCBs in Bangladesh and they execute banking activities according to Islami Shariah-based principles i.e. Profit-Loss Sharing (PLS) mode.[1]",
            "",
            "Al-Arafah Islami Bank Limited",
            "EXIM Bank Limited",
            "First Security Islami Bank Limited",
            "Global Islamic Bank Ltd",
            "ICB Islamic Bank Limited",
            "Islami Bank Bangladesh Limited",
            "Shahjalal Islami Bank Limited",
            "Social Islami Bank Limited",
            "Union Bank Ltd",
            "Standard Bank Limited",
            "Foreign commercial banks (FCBs)",
            "In total 9 FCBs are operating in Bangladesh as the branches of the banks which are incorporated in abroad.[1]",
            "",
            "Bank Al-Falah Limited (United Arab Emirates)",
            "Citibank N.A (United States of America)",
            "Commercial Bank of Ceylon PLC (Sri Lanka)",
            "Habib Bank Limited (Pakistan)",
            "HSBC (Hong Kong)",
            "National Bank of Pakistan (Pakistan)",
            "Standard Chartered Bank (United Kingdom)",
            "State Bank of India (India)",
            "Woori Bank (South Korea)",
            "Non-scheduled banks",
            "Non-scheduled banks are licensed only for specific functions and objectives, and do not offer the same range of services as scheduled banks. There are now 5 non-scheduled banks in Bangladesh.[1]",
            "",
            "Ansar VDP Unnayan Bank",
            "Grameen Bank",
            "Jubilee Bank",
            "Karmashangosthan Bank",
            "Palli Sanchay Bank",
            "Non-bank financial institutions (NBFIs)",
            "Non-bank financial institutions (NBFIs), simply known as financial institutions (FIs), are those types of financial institutions which are regulated under Financial Institution Act, 1993 and controlled by Bangladesh Bank. Now, 34 FIs are operating in Bangladesh while the maiden one was established in 1981. Out of the total, two are fully government owned, one is the subsidiary of a SOCB, 15 were initiated by private domestic initiative and 15 were initiated by joint venture initiative.[1]",
            "",
            "NBFI's include:[2]",
            "",
            "Agrani SME Financing Company Limited",
            "Bangladesh Finance and Investment Company Limited (BD Finance)",
            "Bangladesh Industrial Finance Company Limited (BIFC)",
            "Bangladesh Infrastructure Finance Fund Limited (BIFFL)",
            "Bay Leasing & Investment Limited",
            "CVC Finance Limited",
            "Delta Brac Housing Finance Corporation Ltd. (DBH)",
            "Fareast Finance & Investment Limited",
            "FAS Finance & Investment Limited",
            "First Finance Limited",
            "GSP Finance Company (Bangladesh) Limited (GSPB)",
            "Hajj Finance Company Limited",
            "IDLC Finance Limited",
            "Industrial and Infrastructure Development Finance Company Limited (IIDFC)",
            "Infrastructure Development Company Limited (IDCOL)",
            "International Leasing and Financial Services Limited",
            "IPDC Finance Limited",
            "Islamic Finance and Investment Limited",
            "LankaBangla Finance Limited",
            "Lankan Alliance Finance Limited",
            "Meridian Finance and Investment Ltd.",
            "MIDAS Financing Limited. (MFL)",
            "National Finance Ltd",
            "National Housing Finance and Investments Limited",
            "People's Leasing and Financial Services Ltd",
            "Phoenix Finance and Investments Limited",
            "Premier Leasing & Finance Limited",
            "Prime Finance & Investment Ltd",
            "Reliance Finance Limited",
            "Saudi-Bangladesh Industrial and Agricultural Investment Company Limited (SABINCO)",
            "The UAE-Bangladesh Investment Co. Ltd",
            "Union Capital Limited",
            "United Finance Limited",
            "Uttara Finance and Investments Limited")
        initAutoCompleteTextView(bankList)
    }

    private fun initAutoCompleteTextView(dataList: List<String>) {
        var autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.select_dialog_item, dataList)
        autoCompleteTextView.setAdapter(adapter)

        autoCompleteTextView.threshold = 1

       /* autoCompleteTextView.doOnTextChanged { text, start, before, count ->
            if(text!!.isEmpty()){
                //autoCompleteTextView.setAdapter(adapter)
                autoCompleteTextView.showDropDown()
            }
        }*/

        autoCompleteTextView.onFocusChangeListener =
            View.OnFocusChangeListener { p0, focused ->
                if(focused){
                    autoCompleteTextView.showDropDown()
                }
            }
    }
}