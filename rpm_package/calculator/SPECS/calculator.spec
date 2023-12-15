Name:       calculator
Version:    1.0
Release:    1%{?dist}
Summary:    Simple Calculator Application

License:    MIT
URL:        https://github.com/yourusername/calculator
Source0:    calculator.py

# Dependencies if any (e.g., for Python scripts)
BuildRequires: python3

%description
A simple calculator application for basic arithmetic operations.

%prep

%build

%install
mkdir -p %{buildroot}/usr/bin
install -p -m 755 %{SOURCE0} %{buildroot}/usr/bin/calculator

%files
/usr/bin/calculator

%changelog
* Your Name <your@email.com> - 1.0-1
- Initial build
