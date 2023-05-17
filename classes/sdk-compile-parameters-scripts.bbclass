
# This function creates an llvm environment-setup-script for use in a deployable SDK
sdk_compile_parameters_scripts() {
        # Create environment setup script.  Remember that $SDKTARGETSYSROOT should
        # only be expanded on the target at runtime.
        echo 'export PATH=/usr/bin:$PATH' >> $script
        echo 'export PKG_CONFIG_PATH=$PKG_CONFIG_PATH:$SDKTARGETSYSROOT/usr/lib/aarch64-linux-gnu/pkgconfig' >> $script
}
