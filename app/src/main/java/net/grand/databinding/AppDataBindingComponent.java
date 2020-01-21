package net.grand.databinding;

public class AppDataBindingComponent implements androidx.databinding.DataBindingComponent {

    public OtherViewsBinding getOtherViewsBinding(){ return new OtherViewsBinding(); }
}
