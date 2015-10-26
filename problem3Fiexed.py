import json
import os.path

path = os.getcwd() + "/installed_modules/"


def package_manager():
    dependencies_file = open('dependencies.json', 'r')
    all_packages_file = open('all_packages.json', 'r')

    dep_file_values = json.load(dependencies_file)
    all_packages_values = json.load(all_packages_file)
    element = dep_file_values['dependencies']
    for toInstall in element:
        print("Installing {0}".format(toInstall))
        for el in all_packages_values[toInstall]:
            print(
                "In order to install, {0} we have to install {1}.".format(toInstall, el))

            if not os.path.exists(path + el):
                print("Installing {0}".format(el))
                os.mkdir(path + el)
            else:
                print("{0} is already installed !".format(toInstall))
                toInstall = el

            for x in all_packages_values[el]:
                print(
                    "In order to install {0}, we have to install {1}.".format(el, x))
                if not os.path.exists(path + x):
                    os.mkdir(path + x)
                    print("Installing {0}".format(x))
                else:
                    print("{0} is already installed !".format(x))

package_manager()


def main():

    if __name__ == '__main__':
        main()
